package Test2;

public class Test4 {
	

	static String makeTags(String tag,String word)
	{
		return ("<"+tag+">"+word+"</"+tag+">");
	}

	public static void main(String[] args) {
		
		String s1=makeTags("i", "yay");
		String s2=makeTags("i", "hello");
		String s3=makeTags("city", "yay");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
