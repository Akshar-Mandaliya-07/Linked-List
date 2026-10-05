public class Remove_FirstNode{
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

    // Remove the first node
    public void removeFirst(){
        if(head == null){
            return;
        }else{
            head = head.next;
        }
    }

    public void display(){
        node temp = head;
        System.out.print("Singly_Linked_List : ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Remove_FirstNode RF = new Remove_FirstNode();
        RF.addNodeLast(10);
        RF.addNodeLast(20);
        RF.addNodeLast(30);
        RF.addNodeLast(40);
        RF.removeFirst();
        RF.display();
    }
}
