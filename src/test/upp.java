package test;

public class upp {
	public static void main(String[] args) {
		String s1="SouMIKSARdar";
		int arr[]=new int[123];
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			arr[ch]++;
			
		}
		for(int i=92;i<=122;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i +"->" + arr[i]);
			}
			
		}
	}

}
