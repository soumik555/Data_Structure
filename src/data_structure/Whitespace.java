package data_structure;

public class Whitespace {
	static int space(String s1)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isWhitespace(s1.charAt(i)))
			{
				
				count++;
			}
			
		}
		return count++;
		
	}
	public static void main(String[] args)
	{
		String s1="Soumik is a good boy and i will get a nice job in kolkata";
		System.out.println(space(s1));
		
		
	}

}
