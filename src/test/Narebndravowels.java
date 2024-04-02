package test;

public class Narebndravowels {
	
	public static void main(String[] args) {
		String s1="narendramodi";
		int arr[]=new int[123];
		for(int i=0;i<s1.length();i++)
		{
			
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				arr[ch]++;
				
			}
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i+" ->" + arr[i]+" times");
				
			}
			
				
		}
			
		}
		
	}


