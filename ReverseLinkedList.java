import java.util.Stack;
public class ReverseLinkedList{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head = null;


    // Insert end of the list
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

    // public Stack<Integer> pushDataStack(){
    //     Stack<Integer> stack = new Stack<>();
    //     if(head == null)   return null;
    //         node temp = head;
    //         while(temp != null){
    //             stack.push(temp.data);
    //             temp = temp.next;
    //         }
        
    //     return stack;
    // }

    // public node newLinkedList(Stack<Integer> ans){
    //     if(ans.isEmpty())  return null;
    //     node newHead = new node(ans.peek());
    //     node temp = newHead;
    //     ans.pop();
    //     while(!ans.isEmpty()){
    //         node current = new node(ans.peek());
    //         temp.next = current;
    //         temp = temp.next;
    //         ans.pop();
    //     }
    //     return newHead;
    // }

    public node simple(){
        if(head == null)  return head;
        node current = head;
        node prev = null;
        while(current != null){
            node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }

    // Print the Linked List
    public void display(node newHead){
        node temp = newHead;
        System.out.print("Insert in Last : ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println(" ");
    }


    public static void main(String args[]){
        ReverseLinkedList RL = new ReverseLinkedList();
        RL.addNodeLast(1);
        RL.addNodeLast(3);
        RL.addNodeLast(2);
        RL.addNodeLast(5);
        node newHead = RL.simple();
        RL.display(newHead);
        // Stack<Integer> ans = RL.pushDataStack();
        // node data = RL.newLinkedList(ans);
        // RL.display(data);
    }
}