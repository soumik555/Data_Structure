package data_structure;

public class String_TestCase {
	
	
	
	
	public static void main(String[] args) {
		String str="I lOVE CODING";
		
		String s1=str.replace(" ", "");
		char ch[]=str.toCharArray();
		int j=s1.length()-1;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				ch[i]=s1.charAt(j--);
				
			}
		}
		System.out.println(ch);
		
	}

}
