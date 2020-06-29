package linklist;
import java.util.*;
public class TestNode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	Node head = null;	
		L ll = new L();
		Node m = ll.getlist();
	 head = m;
	 System.out.println("elements in a linklist");
		ll.print(head);
		int size= ll.length(head);
		System.out.println("size of the linked list is");
		
		System.out.println(size);
		System.out.println("enter the element you want to insert and position");
		int d= sc.nextInt();
		int p= sc.nextInt();
		
  Node t =ll.InsertAtPosition(head,d,p);
  ll.print(t);
	}
}
 class L
 {
   Node getlist() {
		Node head = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the list");
		int s = sc.nextInt();
		System.out.println("enter the "+ s+ " elements");
		
		
		for(int i=1;i<=s;i++) {
			if( head==null) {
				Node start = new Node(sc.nextInt());
				head = start;
			}
			else
			{
				Node p = head;
			Node newnode= new Node(sc.nextInt());
			while(p.next!= null)
				p=p.next;
			
			p.next = newnode;
			}
			
		}
		
		return head;	
		}
   void print( Node head)
   {
	   Node p = head;
	   while(p!= null) {
		   System.out.println(p.data);
		   p=p.next;
   }
   }
   public int length(Node head)
   {
	   if(head==null)
		   return 0;
	   int count=0;
	   Node p = head;
	   while(p!= null)
	   {
		   count++;
		   p=p.next;
	   }
	   return count;
   }
   public Node InsertAtPosition(Node head,int data,int position)
   {
	   int size = length(head);
	   if( position> size+1 || position <1)
	   {
	   System.out.println("invalid postion");
	   return head;
	   }
	Node newnode = new Node(data);
	if ( position==1) {
		newnode.next = head;
		return newnode;
	}
	else {
		Node p = head;
		for(int i=1;i<position-1;i++)
		{
			p=p.next;
		}
		newnode.next=p.next;
		p.next=newnode;
		
		return head;
		
	}
   }}
class Node
{
	int data;
	Node next;
	Node( int data){
		this.data = data;
		next= null;
	}
}
 
