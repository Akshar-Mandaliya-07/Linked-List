import java.util.ArrayList;
public class mergeNodesBetweenZeros{
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

    // Merge Nodes
    // public ArrayList<Integer> detectNode(){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     // if(head == null)  return head;
    //         int total = 0;
    //         node temp = head.next;
    //         while(temp != null){
    //             if(temp.data != 0){
    //                 total += temp.data;
    //                 temp = temp.next;
    //             }else{
    //                 list.add(total);
    //                 temp = temp.next;
    //                 total = 0;
    //             }
    //         }
    //     return list;
    // }

    // public node createLinkedList(ArrayList<Integer> ans){
    //     if(ans.isEmpty()){
    //         return null;
    //     }else{
    //         // node newHead = new node(ans.get(0));
    //         head.data = ans.get(0);
    //         node temp = head;
    //         for(int i = 1 ; i < ans.size() ; i++){
    //             node current = new node(ans.get(i));
    //             temp.next = current;
    //             temp = temp.next;
    //         }
    //     }
    //     return head;
    // }

    public void manage(){
        
    }

    // Print the Linked List
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

    public static void main(String[] args) {
        mergeNodesBetweenZeros MN = new mergeNodesBetweenZeros();
        MN.addNodeLast(0);
        MN.addNodeLast(3);
        MN.addNodeLast(1);
        MN.addNodeLast(0);
        MN.addNodeLast(4);
        MN.addNodeLast(5);
        MN.addNodeLast(2);
        MN.addNodeLast(0);
        MN.display();
        // // MN.display();
        // ArrayList<Integer> ans = MN.detectNode();
        // node aanswer = MN.createLinkedList(ans);
        // MN.display(aanswer);
        // // for(int data : ans){
        // //     System.out.print(data + " ");
        // // }
        // // System.out.print(ans + " ");
    }
}