package project3;

public class RotateArray {

	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		
		for(int j=0;j<4;j++)
		{
		int last=a[4];
		for(int i=4;i>=1;--i)
		{
			int temp=0;
			
			a[i]=a[i-1];
			
			
		}
		a[0]=last;
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
			

	}

}
