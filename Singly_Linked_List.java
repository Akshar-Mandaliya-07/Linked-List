public class Singly_Linked_List{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    // Insert Node at Begining
    public void addElement(int data){
        node current = new node(data);
        if(head == null){
            head = current;
            return;
        }else{
            current.next = head;
            head = current;
        }
    }

    // Display Node
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
        Singly_Linked_List SLL = new Singly_Linked_List();
        SLL.addElement(1);
        SLL.addElement(2);
        SLL.addElement(3);

        SLL.display();
    }
}
