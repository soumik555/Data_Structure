package data_structure;

public class String3 {
	static void stringlogic(String s1,int no)
	{
		String result="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			result=result+(char)(ch+no);
		
			
		}
		System.out.println(result);
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		String s1="hello";
		int no=4;
		stringlogic(s1, no);
		
		
	}

}
