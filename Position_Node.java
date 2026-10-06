public class Position_Node{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    public void addNodeEnd(int data){
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

    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public void findPosition(int data){
        node temp = head;
        int pos = 1;
        while(temp != null){
            if(temp.data == data){
                System.out.println("Position of Data is : " + pos);
                return;
            }else{
                temp = temp.next;
                pos = pos + 1;
            }
        }
        if(pos != 1)    System.out.println("No Element Exists in Linked List");  
    }

    public static void main(String[] args) {
        Position_Node PN = new Position_Node();
        PN.addNodeEnd(10);
        PN.addNodeEnd(20);
        PN.addNodeEnd(30);
        PN.display();
        PN.findPosition(30);
        PN.findPosition(40);
    }
}
