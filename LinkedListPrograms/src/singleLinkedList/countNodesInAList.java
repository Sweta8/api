package singleLinkedList;

public class countNodesInAList {
	
	class Node
	{
	  int data;
	  Node next;
	  Node(int data)
	  {
		  this.data =data;
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
		countNodesInAList l=new countNodesInAList();
		l.addNode(20);
		l.addNode(30);
		l.addNode(40);
		System.out.println(l.count());
		l.display();
	}

}
