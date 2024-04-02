package practicemam;

public class String_Palindrome {
	public static void main(String[] args) {
		
		String s1="WOW";
		String rev="";
		char arr[]=s1.toCharArray();
		
		for(char s:arr)
		{
			rev=s+rev;
			
		}
		if(s1.equals(rev))
		{
			System.out.println("String is Palindrome:");
		}
		else
		{
			System.out.println("Not a Plaindrome:");
		}
	}

}
