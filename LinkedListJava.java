
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
	static  void printList(Node node){
		if(node==null){
			System.out.println("there is no data to print");
			return;
		}
		while(node.next!=null){
			System.out.print(" "+node.data);
			node=node.next;
		}
		System.out.print(" "+node.data);
		return;
	}
	public static void main(String[] args) {
		Node head=null;
		head=addNode(head,23);
		head=addNode(head,98);
		head=addNode(head,65);
		head=addNode(head,24);
		head=addNode(head,11);
		printList(head);
		head=deleteNode(head,2);
		System.out.println("");
		printList(head);
		
	
	}
}