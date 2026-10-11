public class RemoveNthNodeFromEnd{
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

    public void remove(int n){
        node fast = head;
        if(head == null)   return;
        for(int i = 0 ; i < n ; i++)   fast = fast.next;
        if(fast == null)   head = head.next;
        node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }   
        slow.next = fast;
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
        RemoveNthNodeFromEnd RN = new RemoveNthNodeFromEnd();
        RN.addLastNode(10);
        RN.addLastNode(20);
        RN.addLastNode(30);
        RN.addLastNode(40);
        RN.display();
        RN.remove(2);
        RN.display();
    }
}
