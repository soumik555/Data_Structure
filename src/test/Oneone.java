package test;

public class Oneone {
	
	static int check(String s1)
	{
		int count=0;
		
	    String s2=s1.replaceAll("[.-]"," " );
	    String arr[]=s2.split(" ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i].equals("one"))
	    	{
	    		count++;
	    		
	    	}
	    	
	    }
	    return count;
		
	}
	public static void main(String[] args) {
		String  s1="One-one was a race horse. Two two was one too. One-one won one race. Two two won one too";
        System.out.println("one is repeated for "+check(s1) + " times");
   }
	
 }
