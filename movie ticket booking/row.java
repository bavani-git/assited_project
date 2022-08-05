package phase1.project;

import java.util.LinkedList;

	public  class row {
		LinkedList<Integer>l =new LinkedList<>();
		 
		row(){
		
		 	l.add(0);
			l.add(0);
			l.add(0);
			l.add(0);
			l.add(0);
			l.add(0);
			l.add(0);
			l.add(0);
			l.add(0);
			l.add(0); 
			}
		 
		 public int seat(int d)
		{
			if(l.get(d)==1)
				return -1;
			else
			{
				
				l.set(d,1);
				return 1;
				
				
			}
		}
	

}
