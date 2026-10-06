public class Remove_LastNode{
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

    public void removeLastNode(){
        if(head == null)   return;
        else{
            node p = head;
            node q = head.next;

            while(q.next != null){
                q = q.next;
                p = p.next;
            }
            p.next = null;
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
        Remove_LastNode RL = new Remove_LastNode();
        RL.addNodeLast(10);
        RL.addNodeLast(20);
        RL.addNodeLast(30);
        RL.display();
        RL.removeLastNode();
        RL.display();
    }
}
