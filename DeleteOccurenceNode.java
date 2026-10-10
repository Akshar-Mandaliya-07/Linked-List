public class DeleteOccurenceNode{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    public void addLastNode(int data){
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
        }
    }

    public void deleteOccurence(int value){
        if(head == null){
            return;
        }
        node temp = head;
        while(temp != null && temp.next != null){
            if(head.data == value)   head = head.next;
            else{
                if(temp.next.data == value){
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }
            }
        }
    }

    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println(" ");
    }
    public static void main(String[] args) {
        DeleteOccurenceNode DO = new DeleteOccurenceNode();
        DO.addLastNode(10);
        DO.addLastNode(10);
        DO.addLastNode(20);
        DO.addLastNode(30);
        DO.addLastNode(20);
        DO.addLastNode(10);
        DO.display();
        DO.deleteOccurence(10);
        DO.display();
    }
}
