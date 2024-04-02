package data_structure;

public class Removeadjacentwithoutusingequals {
	
	
	static boolean remove(String s1,String s2 )
	{
		if(s1.length()!=s2.length())
		{
			return true;
		}
		
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.length()!=s2.length())
			{
				return true;
				
			}
			
			
		}
		
		return false;
		
	}
		
	
	public static void main(String[] args) {
		
		
		String str="hi hi how hi are are you you";
		String s1[]=str.split(" ");
		
		for(int i=0;i<s1.length-1;i++)
		{
			
			if(remove(s1[i],s1[i+1]))
			{
				System.out.println(s1[i] + "");
				
			}	
		
	}
		System.out.println(s1[s1.length-1]);

}
	}
