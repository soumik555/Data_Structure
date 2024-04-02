package practicemam;

public class Largest {
	
	static void largest()
	{
		int arr[]= {20,98,63,87,11,25};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			
		}
		System.out.println(max);
	}
	public static void main(String[] args)
	{
		largest();
		
	}

}
