package project3;

public class LIS {

	public static void main(String[] args) 
	{
		int arr[]={5,6,4,3,7};
		int n=arr.length;
		int lis[]={1,1,1,1,1}; 
		for (int i = 1; i < n; i++ ) 
		{ 
			lis[i] = 1; 
			for (int j = 0; j < i; j++ ) 
				if ( arr[i] > arr[j] && lis[i] < lis[j] + 1) 
					lis[i] = lis[j] + 1; 
		} 
		int max =0;
		for(int i=0;i<n;i++)
		{
			
			if(max<lis[i])
			{
				max=lis[i];
			}
		}
		int cur= 1;
		for(int i=0;i<n;i++)
		{
			if(cur<=max)
			if(cur==lis[i])
			{
				System.out.print(arr[i]+" ");
				cur+=1;
			}
		}
			
	}

}
