public class Middle_Node{
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

    // Count Node
    public int countNode(){
        node temp = head;
        int count = 0;
        while(temp != null){
            count = count + 1;
            temp = temp.next;
        }
        //count / 2;
        return count / 2;
    }

    public int findmiddle(int pos){
        node temp = head;
        if(head == null)  return 0;
        else{
            for(int i = 0 ; i < pos - 1 ; i++){
                temp = temp.next;
            }
        }
        return temp.next.data;
    }
    public static void main(String[] args) {
        Middle_Node MN = new Middle_Node();
        MN.InsertLast(12);
        MN.InsertLast(24);
        MN.InsertLast(36);
        MN.InsertLast(48);
        MN.InsertLast(60);
        // MN.InsertLast(72);
        int ans = MN.countNode();
        // System.out.print(ans);
        int data = MN.findmiddle(ans);
        System.out.print(data);
    }

}
