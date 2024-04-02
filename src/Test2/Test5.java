package Test2;

public class Test5 {
	
	public static boolean check(String str)
	{
		String s1=str.substring(0,2);
		if(str.startsWith(s1) && str.endsWith(s1))
		{
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		String s="edited";
		String s1="edit";
		String s2="ed";
		System.out.println(check(s));
		System.out.println(check(s1));
		System.out.println(check(s2));
	}

}
