package project3;

class circular
{
	class Node
	{
	int data;
	Node next;
	}
	
	Node head;
	Node tail;
	
	void ins(int d)
	{
		Node node= new Node();
		node.data=d;
		
		if(head==null)
		{
			head =node;
		}
		else
		{
			tail.next=node;
		}
		tail=node;
		tail.next=head;
	}
	
	void show()
	{
		Node temp;
		temp=head.next;
		System.out.println(head.data+"  ");
		while(temp!=head)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	void arrange()
	{
		
	}
}


public class CircularLinkedListInsert 
{
	public static void main(String[] args) 
	{
		circular c= new circular();
		c.ins(44);
		c.ins(212);
		c.ins(234);
		c.show();
	}

}
