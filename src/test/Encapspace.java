package test;

public class Encapspace {
	
	
	
	public static void main(String[] args) 
	{
		int space=0;
		String s1="Encapsulation is an important property of oops in java.It is the property of wrapping of data member along with function member in one single encapsulated unit";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isWhitespace(ch))
			{
				space++;
				
			}
		}
		System.out.println(space);
	
	}

}
