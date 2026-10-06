public class Insert_Specific_Position{
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

    public void insertElementSpecificPosition(int pos , int data){
        node current = new node(data);
        node temp = head;
        if(pos == 1){
            current.next = head;
            head = current;
            return;
        }
        
        for(int i = 0 ; i < pos - 2 && temp != null ; i++){
            temp = temp.next;
        }   

        if(temp == null){
            System.out.println("Invalid Position");
        }else{
            current.next = temp.next;
            temp.next = current;
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
        Insert_Specific_Position ISP = new Insert_Specific_Position();
        ISP.addNodeLast(100);
        ISP.addNodeLast(200);
        ISP.addNodeLast(300);
        ISP.addNodeLast(400);
        ISP.display();
        ISP.insertElementSpecificPosition(3 , 250);
        ISP.display();
    }
}
