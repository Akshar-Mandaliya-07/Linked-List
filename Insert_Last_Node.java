public class Insert_Last_Node{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head = null;


    // Insert end of the list
    public void addNodeLast(int data){
        node current = new node(data);
        if(head == null){
            head = current;
            return;
        }else{
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = current;
            current.next = null;
        }
    }

    // Print the Linked List
    public void display(){
        node temp = head;
        System.out.print("Insert in Last : ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Insert_Last_Node LN = new Insert_Last_Node();
        LN.addNodeLast(1);
        LN.addNodeLast(2);
        LN.addNodeLast(3);

        LN.display();
    }
}
