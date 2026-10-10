public class Remove_Duplicate{
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

    public void OtherLogic(){
        node temp = head;
    }

    // List is Sorted
    public void removeDuplicate(){
        node temp = head;
        while(temp != null){
            node current = temp;
            while(current != null && current.next != null){
                if(current.next.data == current.data){
                    // if list is not sorted 
                    // if current.next.data == temp.data then current.next.next
                    current.next = current.next.next;
                }else{
                    current = current.next;
                }
            }
            temp = temp.next;
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
        Remove_Duplicate RD = new Remove_Duplicate();
        RD.addLastNode(10);
        RD.addLastNode(10);
        RD.addLastNode(20);
        RD.addLastNode(30);
        // RD.addLastNode(40);
        RD.display();
        RD.removeDuplicate();
        RD.display();
    }
}
