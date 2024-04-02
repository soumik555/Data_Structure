package practicemam;

public class Stringarray_remove_duplicates {
	public static void main(String[] args) {
		
		String arr[]= {"apple","banana","orange","apple","apple","grape","banana"};
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			
			{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				
			}
			if(count==1)
			{
				System.out.println(arr[i] + " is the unique value");
				
			}
			
		}
	}

}
  }
