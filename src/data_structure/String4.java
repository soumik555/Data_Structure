package data_structure;
//ip-java
//op-neze
public class String4 {
	static String logic(String s1,int no)
	{
		String result="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			result=result+(char)(ch+no);
			
		}
		return result;
		
		
	}
	
	
	public static void main(String[] args) 
	{   String s1="java";
	    int no=4;
		System.out.println(logic(s1, no));
		
	}

}
