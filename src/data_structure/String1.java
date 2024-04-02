package data_structure;

//find length of string without using any inbuilt method

public class String1 {
	public static void main(String[] args) 
	{
		String s1="soumik";
		int count=0;
		char arr[]=s1.toCharArray();
//		for(int i=0;i<arr.length;i++)
//		{
//			count++;
//		}
		
		for(char ch:arr)
		{
			count++;
		}
		System.out.println(count);
	
		
	}

}
