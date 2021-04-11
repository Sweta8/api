package singleLinkedList;

public class ReverseLinkedList {
	
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
		public Node head=null;
		public Node tail=null;
		public void addNode(int data)
		{
			Node newNode=new Node(data);
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;
			}
		}
		
		public void reverse(Node current)
		{
			if(head==null)
			{
				System.out.println("List is empty");
				return;
			}
			else
			{
			if(current.next==null)
			{
				System.out.print(current.data+" ");
				return;
			}
			reverse(current.next);
			System.out.print(current.data+" ");
		}
			
			
	}
		
		public void display()
		{
			Node current=head;
			if(head==null)
			{
				System.out.println("List is empty");
				return;
			}
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
		
		public static void main(String[] args)
		{
			ReverseLinkedList l=new ReverseLinkedList();
			l.addNode(20);
			l.addNode(40);
			l.addNode(50);
			l.display();
			l.reverse(l.head);
			
		}
		
	}
