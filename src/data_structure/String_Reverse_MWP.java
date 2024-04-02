package data_structure;

public class String_Reverse_MWP {
	
	static void reverse(String str)
	{
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);			
		}
		System.out.print(reverse);
		
		
		
	}
	public static void main(String[] args) 
	{
		String str="Hi how are you";
		String arr[]=str.split("//str+");
		for(int i=0;i<arr.length;i++)
		{
			reverse(arr[i]+" ");
			
		}
		
		
	}

}
