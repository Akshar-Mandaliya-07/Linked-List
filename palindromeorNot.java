public class palindromeorNot{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

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

    public node myMethod(){
        if(head == null)  return head;
        else{
            node slow = head;
            node fast = head;
            int total = 0;
            while(fast != null && fast.next != null){
                total++;
                slow = slow.next;
                fast = fast.next.next;
            }
            node temp = head;
            for(int i = 0 ; i < total - 1 ; i++){
                temp = temp.next;
            }
            temp.next = null;
            return slow;
            // System.out.println(total);
        }
    }

    public node reverseHalfLinkedList(node current){
        node prev = null;
        while(current != null){
            node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }

    public boolean compareLinkedList(node secondHead){
        node temp1 = head;
        node temp2 = secondHead;
        if(head == null || secondHead == null)   return false;
        else{
            while(temp2 != null && temp2.next != null){
                if(temp1.data == temp2.data){
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public void display(){
        node temp = head;
        System.out.print("Insert in Last : ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println(" ");
    }

    public static void main(String args[]){
        palindromeorNot PN = new palindromeorNot();
        PN.InsertLast(10);
        PN.InsertLast(20);
        PN.InsertLast(30);
        PN.InsertLast(30);
        PN.InsertLast(20);
        PN.InsertLast(10);
        // PN.display();
        node ans = PN.myMethod();
        // PN.display();
        node ansTwo = PN.reverseHalfLinkedList(ans);
        boolean finalanswer = PN.compareLinkedList(ansTwo);
        System.out.println(finalanswer);
        // System.out.println(ansTwo.data);
        // PN.display();
    }
}