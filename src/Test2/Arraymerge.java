package Test2;

public class Arraymerge {
	
	
	static int plustwo(int arr[],int brr[])
	{
		int result[]=new int[arr.length+brr.length];
		int j=0;
		
		for(int i=0;i<arr.length;i++,j++)
		{
			result[j]=arr[i];
			
		}
		
		for(int k=0;k<brr.length;k++ ,j++)
		{
			result[j]=brr[k];
			
		}
		
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i] + " ");
			
		}
		return j;
		
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2};
		int brr[]= {3,4};
		
		System.out.println(plustwo(arr, brr));
	}

}
