package data_structure;
//find frequency of only uppercase
public class Frequency3 {
	public static void main(String[] args) {
		String s1="JaVat";
		int arr[]=new int[123];
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			arr[ch]++;
			
			
		}
		for(int i=65;i<=90;i++)
			
		{
			if(arr[i]!=0)
			{
			System.out.println((char)i+" is repeated for " + arr[i]+" times");
			}
		}
	}
	

}
