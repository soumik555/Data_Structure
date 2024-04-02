package test;

public class Overloaddefcount {
public static void main(String[] args) {
	String s1="method overloading means developing multiple method or different method with same method name but there should be variation in the argument list";
	
	int arr[]=new int[123];
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		arr[ch]++;
		
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
			if(arr[i]>5) {
				
			
			System.out.println((char)i + "->" + arr[i] + " times");
			}
		}
	}
}
}
