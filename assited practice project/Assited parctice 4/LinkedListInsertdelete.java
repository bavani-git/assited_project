package project3;

class LinkedList
{
class Node
{
	int data;
	Node next; 
}

	Node head;
	
	public void Insert(int d)
	{
		Node node=new Node();
		node.data=d;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void del()
	{
		Node n2=head;
		head=head.next;
		n2.next=null;
		//head.;
	}
	
	public void show()
	{
		Node n1=head;
		while(n1.next != null)
		{
			System.out.print(n1.data+"->");
			n1=n1.next;
		}
		System.out.print(n1.data);
		
	}
}


public class LinkedListInsertdelete {
	public static void main(String[] args) 
	{
		LinkedList s= new LinkedList();
		s.Insert(1);
		s.Insert(2);
		s.Insert(3);
		s.show();
		s.del();
		s.show();

	}

}
