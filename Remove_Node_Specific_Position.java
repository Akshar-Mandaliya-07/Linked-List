public class Remove_Node_Specific_Position{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head = null;

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

    public void removeSpecificPosition(int pos){
        if(head == null){
            return;
        }
        if(pos == 1){
            head = head.next;
        }else{
            node pre = head;
            node temp = head.next;
            for(int i = 0 ; i < pos - 2 ; i++){
                pre = pre.next;
                temp = temp.next;
            }
            pre.next = temp.next;
            return;
        }
    }
    public void display(){
        node temp = head;
        System.out.print("List is : ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Remove_Node_Specific_Position RN = new Remove_Node_Specific_Position();
        RN.addNodeLast(10);
        RN.addNodeLast(20);
        RN.addNodeLast(30);
        RN.addNodeLast(40);
        RN.display();
        RN.removeSpecificPosition(3);
        RN.display();
    }
}
