public class Delete_Present_Array{
    class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head = null;

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

    public void deleteNode(int data){
        node temp = head;
        if (head != null && head.data == data) {
            head = head.next;
            return;
        }else{
            while(temp != null && temp.next != null){
                if(temp.next.data == data){
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }
            }
        }
    }

    public void display(){
        node temp = head;
        System.out.print("List is : ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Delete_Present_Array DPA = new Delete_Present_Array();
        DPA.addNodeLast(1);
        DPA.addNodeLast(2);
        DPA.addNodeLast(3);
        DPA.addNodeLast(4);
        DPA.display();
        System.out.println("");
        int arr[] = {1,2,3,4};
        for(int i = 0  ; i < arr.length ; i++){
            DPA.deleteNode(arr[i]);
        }
        DPA.display();
    }
}
