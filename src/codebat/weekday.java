package codebat;

public class weekday {

	static boolean sleepIn(boolean weekday,boolean vacation)
	{
		if(!weekday||vacation)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(sleepIn(true, false));
		
	}
}
