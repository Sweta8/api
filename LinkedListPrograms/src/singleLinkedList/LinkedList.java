package singleLinkedList;

public class LinkedList {
	
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
	
	public Node head;
	public Node tail;
	
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
	public void display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("lis is empty");
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
		LinkedList l=new LinkedList();
		l.addNode(20);
		l.addNode(40);
		l.addNode(50);
		l.display();
		
	}

}
