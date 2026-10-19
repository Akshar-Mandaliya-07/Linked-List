public class rotatelist{
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

    public void rotate(int total){
        if(head == null || head.next == null)  return;
        else{
            while(total > 0){
                node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                node newNode = temp;
                temp = head;
                while(temp.next.next != null){
                    temp = temp.next;
                }
                temp.next = null;
                newNode.next = head;
                head = newNode;

                total--;
            }
        }
    }

    public void display(){
        if(head == null)  return;
        else{
            node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print("NULL");
            System.out.println(" ");
        }
    }

    public static void main(String args[]){
        rotatelist rl = new rotatelist();
        rl.InsertLast(10);
        rl.InsertLast(20);
        rl.InsertLast(30);
        rl.InsertLast(40);
        rl.InsertLast(50);
        rl.display();
        rl.rotate(3);
        rl.display();
        // rl.rotate();
        // rl.display();
    }
}

// 10     20      30      40      50
// temp = 50
// length = 5

