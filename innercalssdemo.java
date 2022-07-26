package projects;

class OuterClass {
	  int x = 10;

	  public class InnerClass {
	    int y = 5;
	  }
	}

public class innercalssdemo {

	public static void main(String[] args) {
		OuterClass ot= new OuterClass();
		OuterClass.InnerClass oi= ot.new InnerClass(); 
		int c=0;
		c=ot.x+oi.y;
		System.out.println("the value is:"+c);
	}

}
