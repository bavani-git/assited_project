package project3;

public class DoublyLinkedList 
{
	class Node
	{
		int data;
		Node prev;
		Node next;
	}
	Node head=null;
	Node tail=null;
	
	public void ins(int data)
	{
		Node n = new Node();
		n.data=data;
		if(head==null) 
		{
			head=n;
			tail=n;
			head.prev=null;
			tail.next=null;
		}
		else
		{
			tail.next=n;
			n.prev=tail;
			tail=n;
			tail.next=null;
		}
	}
	public void dis()
	{
		Node temp=head;
		System.out.println("displaying content in forward direction");
		if(head==null)
		{
			System.out.println("empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println(temp.data);
				
				temp=temp.next;
			}
		}
		System.out.println("reverse");
		Node rev=tail;
		while(rev!=null)
		{
			System.out.println(rev.data);
			rev=rev.prev;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		DoublyLinkedList s = new DoublyLinkedList();
		s.ins(4);
		s.ins(5);
		s.ins(8);
		s.dis();
	}
}
