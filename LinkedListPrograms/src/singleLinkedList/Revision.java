package singleLinkedList;

public class Revision {
	
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
	public int count()
	{
		int count=0;
		Node current=head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
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
			System.out.println(current.data+" ");
			current=current.next;
		}
		
	}
	public static void main(String[] args)
	{
		Revision r=new Revision();
		r.addNode(20);
		r.addNode(40);
		r.addNode(50);
		r.display();
		System.out.println(r.count());
		r.reverse(r.head);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


