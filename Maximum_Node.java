public class Maximum_Node{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

     // Insert Node at Begining
    public void addElement(int data){
        node current = new node(data);
        if(head == null){
            head = current;
            return;
        }else{
            current.next = head;
            head = current;
        }
    }

    // Maximum Node in Linked List
    public void maximumNode(){
        int max = Integer.MIN_VALUE;
        node temp = head;
        while(temp != null){
            if(temp.data > max){
                max = temp.data;
                temp = temp.next;
            }else temp = temp.next;
        }
        System.out.println("Maximum Node : " + max);
    }

    public static void main(String[] args) {
        Maximum_Node MN = new Maximum_Node();
        MN.addElement(10);
        MN.addElement(20);
        MN.addElement(30);
        MN.addElement(40);
        MN.addElement(-1);
        
        MN.maximumNode();
    }
}
