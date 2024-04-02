package Test2;

public class Testcase3 {
	public static String withoutx(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.startsWith("x")==str.endsWith("x"))
			{
				s=str.replace("x", "");
				
			}
			else if(str.startsWith("x")!=str.endsWith("x"))
			{
				return str;
				
			}
			
		}
		return s;
		
		
	}
	
	public static void main(String[] args) {
		String str="xHix";
		System.out.println(withoutx(str));
		
		
	}

}
