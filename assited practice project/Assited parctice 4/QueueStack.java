package project3;

	class queue
	{
		class Node
		{
			int data;
			Node next; 
		}

			Node head;
			public void remove()
			{
				Node n2=head;
				head=head.next;
				n2.next=null;
				//head.;
			}
			
			public void add(int d)
			{
				Node n =new Node();
				Node temp1;
				n.data=d;
				if(head==null)
					head=n;
				else
				{
					n.next=head;
					n=head;
					//System.out.println("dffwer");
				}
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

	public class QueueStack {
		public static void main(String[] args) 
		{
			queue q= new queue();
			q.add(10);
			q.add(2);
			q.add(3);
			q.show();
			//q.remove();
			//q.show();
		}

	}



