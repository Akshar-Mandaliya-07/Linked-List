// Baki to add the github
public class NthNodeFromEnd{
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

    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println(" ");
    }

    public int totalNode(){
        node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int find(int totalNode , int pos){
        node temp = head;
        if(head == null)  return 0;
        if(totalNode == pos){
            return head.data;
        }
        if(pos > totalNode)    return 0;

        for(int i = 0 ; i < totalNode - pos - 1 ; i++){
            temp = temp.next;
        }
        return temp.next.data;
    }

    public int secondLogic(int pos){
        node temp = head;
        if(head == null)   return 0;
        else{
            for(int i = 0 ; i < pos ; i++){
                temp = temp.next;
            }
        }
        return temp.next.data;
    }

    public static void main(String[] args) {
        NthNodeFromEnd Nth = new NthNodeFromEnd();
        Nth.addLastNode(1);
        Nth.addLastNode(2);
        Nth.addLastNode(3);
        Nth.addLastNode(4);
        Nth.addLastNode(5);
        Nth.addLastNode(6);
        Nth.addLastNode(7);
        int ans = Nth.totalNode();
        System.out.println("Total Node in Linked List is : " + ans);
        int value = Nth.find(ans , 3);
        System.out.println("Present Data : " + value);
        int second = Nth.secondLogic(3);
        System.out.println("Present Data : " + second);
    }
}
