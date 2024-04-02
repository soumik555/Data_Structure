package practicemam;

public class Testcase {
	public static void main(String[] args) {
		String str="a3b3c3d2";
		for(int i=0;i<str.length();i++)
		{
			print(str.charAt(i),str.charAt(i+1));
			
		}
	}

	static void print(char c1,char c2)
	{
		int no=(int)(c2-48);
		for(int i=1;i<=no;i++)
		{
			System.out.println(c1);
			
		}
		
	}

}
