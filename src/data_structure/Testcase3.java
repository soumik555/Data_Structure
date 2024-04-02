package data_structure;

public class Testcase3 {
	
	
	
	
	static void print(char c, String s2)
	{
		int no=Integer.parseInt(s2);
		for(int i=1;i<=no;i++)
		{
			System.out.print(c);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		String str="a10b11c13";
		String s1=str.replaceAll("[0-9]","");
		String s2=str.replaceAll("[a-z]", " ");
		String[]s=s2.split(" ");
		
		for(int i=1;i<s.length;i++)
		{
			print(s1.charAt(i-1),s[i]);
			
			
		}
	}

}
