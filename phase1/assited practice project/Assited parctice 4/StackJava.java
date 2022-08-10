package project3;

import project3.LinkedList.Node;

class Stack
{
	class Node
	{
		int data;
		Node next; 
	}

		Node head;
		
		public void push(int d)
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
		
		public void pop()
		{
			Node n=head;
			Node sam= new Node();
			while(n.next!=null)
			{
				sam=n;
				n=n.next;
			}
			
			sam.next=null;
			
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

public class StackJava {
	public static void main(String[] args) 
	{
		
		Stack s = new Stack();
		s.push(7);
		s.push(2);
		s.push(1);
		s.push(2);
		s.show();
		s.pop();
		System.out.println("\n");
		s.show();

	}

}
