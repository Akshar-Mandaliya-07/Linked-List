public class Delete_Middle_Node{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    // Insert Node at End
    public void InsertLast(int data){
        node current = new node(data);
        if(head == null){
            head = current;
            return;
        }else{
            node temp = head;
            while(temp.next != null) { temp = temp.next; }
            temp.next = current;
        }
    }

    // Delete Middle Node
    public void deleteNode(){
        if(head == null)   return;
        if(head.next == null)   return;
        node slow = head;
        node fast = head;
        fast = fast.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
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
        Delete_Middle_Node MN = new Delete_Middle_Node();
        MN.InsertLast(1);
        MN.InsertLast(2);
        MN.InsertLast(3);
        MN.InsertLast(4);
        MN.InsertLast(5);
        MN.InsertLast(6);
        MN.deleteNode();
        MN.display();
    }
}
