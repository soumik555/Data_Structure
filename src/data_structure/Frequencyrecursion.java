package data_structure;

public class Frequencyrecursion {
	
	
	
	
	
	
	static void palindrome(String str)
	{
		if(!str.isEmpty())
		{
			char ch=str.charAt(0);
			
			String s1=str.replaceAll(ch +"" ,"");
			System.out.println(ch+" -> "+ (str.length()-s1.length()));
			palindrome(s1);
			
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
//		int no=123443321;
//		String s1=String.valueOf(no);
		String s1="Hellohowareyou";
		
		palindrome(s1);
		
	}

}
