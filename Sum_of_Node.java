public class Sum_of_Node{
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
	public void sumOfNode(){
		node temp = head;
		int sum = 0;
		while(temp != null){
			sum = sum + temp.data;
			temp = temp.next;
		}
		System.out.print("Sum of Node is : " + sum);
	}

	public static void main(String[] args) {
        		Sum_of_Node sn= new Sum_of_Node();
       		sn.addElement(1);
        		sn.addElement(2);
       		sn.addElement(3);
		sn.addElement(4);

        		sn.sumOfNode();
	}
    }