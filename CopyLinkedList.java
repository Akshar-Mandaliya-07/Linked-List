public class CopyLinkedList{
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

    public node copyList(){
        if(head == null)  return head;
        else{
            node secondNode = new node(head.data);
            node temp1 = head.next;
            node temp2 = secondNode;
            while(temp1 != null){
                node current = new node(temp1.data);
                temp2.next = current;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return secondNode;
        }
    }

    public void display(node ans){
        node temp = ans;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        CopyLinkedList CL = new CopyLinkedList();
        CL.addLastNode(10);
        CL.addLastNode(20);
        CL.addLastNode(30);
        
        node ans = CL.copyList();
        CL.display(ans);
        
        // System.out.println(ans.data);
    }
}
