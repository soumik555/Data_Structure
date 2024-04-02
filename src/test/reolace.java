package test;

public class reolace {
	
	static String replace(String s1)
	{
		String concat="";
		char arr[]=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				arr[i]='$';
				
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			concat=concat+arr[i];
			
		}
		return concat;
		
		
		
	
	}
	public static void main(String[] args)
	{
		String s1="kolkata";
		String concat=replace(s1);
		System.out.println(concat);
		
	
	}

}
