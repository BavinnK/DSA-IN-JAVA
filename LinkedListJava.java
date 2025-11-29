
public class LinkedListJava {
	static class Node{
		int data;
		Node next;
	}
	static Node addNode(Node head,int data){
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		if(head==null){
			return newNode;
		}
		else{
			Node ptr=head;
			while(ptr.next!=null){
				ptr=ptr.next;
			}
			ptr.next=newNode;
			return head;
		}
		
	}
	static Node deleteNode(Node head,int pos){
		if(head==null){
			System.out.println("there is no node to delete");
			return head;
		}
		else if(pos==1){
			head=head.next;
			return head;
		}
		else{
			Node ptr=head;
			while(pos>0){
				ptr=ptr.next;
				pos--;
				if(ptr.next==null){
					System.out.println("this node does not exist");
				}
			}
			ptr.next=ptr.next.next;
			return head;
		}
	}
	public static void main(String[] args) {
		
	
	}
}