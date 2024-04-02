package test;
class test
{

   static String rev(String s1)
	{
	   String s2="";
	   for(int i=s1.length()-1;i>=0;i--)
		{
		   s2=s2+s1.charAt(i);
		}
		return s2;
	}

	public static void main(String[] args)
	{
		String s1="money is happiness";
		String arr[]=s1.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
	        System.out.print(rev(arr[i])+" ");
		     
		}
		
	}
}
