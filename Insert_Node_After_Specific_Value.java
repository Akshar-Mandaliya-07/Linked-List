public class Insert_Node_After_Specific_Value{
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

    public void insertAfterValue(int value , int data){
        node current = new node(data);
        if(head == null){
            return;
        }else{
            node temp = head;
            while(temp != null){
                if(temp.data == value){
                    current.next = temp.next;
                    temp.next = current;
                    return;
                }else{
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
        Insert_Node_After_Specific_Value IN = new Insert_Node_After_Specific_Value();
        IN.addNodeLast(10);
        IN.addNodeLast(20);
        IN.addNodeLast(30);
        IN.display();
        IN.insertAfterValue(20 , 25);
        IN.display();
    }
}
