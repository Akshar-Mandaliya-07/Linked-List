public class count_node{
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

    // Count Node
    public void countNode(){
        node temp = head;
        int count = 0;
        while(temp != null){
            count = count + 1;
            temp = temp.next;
        }
        System.out.print("Total Node : " + count);
    }

    public static void main(String[] args) {
        count_node cn = new count_node();
        cn.addElement(1);
        cn.addElement(2);
        cn.addElement(3);
        cn.addElement(4);
        
        cn.countNode();
    }
}
