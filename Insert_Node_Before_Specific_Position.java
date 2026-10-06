public class Insert_Node_Before_Specific_Position{
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

    public void InsertBefore(int value , int data){
        node current = new node(data);
        if(head == null){
            head = current;
            return;
        }
        if(head.data == value){
            current.next = head;
            head = current;
            return;
        }
        else{
            node previous = head;
            node temp = head.next;
            while(temp != null){
                if(temp.data == value){
                    previous.next = current;
                    current.next = temp;
                    return;
                }else{
                    previous = previous.next;
                    temp = temp.next;
                }
            }
        }
    }

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
        Insert_Node_Before_Specific_Position IN = new Insert_Node_Before_Specific_Position();
        IN.addNodeLast(10);
        IN.addNodeLast(20);
        IN.addNodeLast(30);
        IN.display();

        IN.InsertBefore(30 , 25);
        IN.display();
    }
}
