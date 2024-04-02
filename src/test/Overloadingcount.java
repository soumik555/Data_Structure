package test;

public class Overloadingcount {
	
	static String reverse(String s1)
	{
		
		char arr[]=s1.toCharArray();
		String rev="";
		for(char c:arr) 
		{
			rev=c+rev;
			
		}
		return rev;
	}
		
	
	public static void main(String[] args) {
		
		
//		String s1="method overloading means developing multiple method or different method with same method name but there should be variation in the argument list";
//        int count=5;
//        String arr[]=s1.split(" ");
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>count)
//			{
//				
//			}
//			
//			
//		}
//		System.out.println(count);
		
		String s1="Hello";
		System.out.println(reverse(s1));
		
	
  }
	
 }
