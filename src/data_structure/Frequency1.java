package data_structure;
//find the frequency of the given array
public class Frequency1 {
	public static void main(String[] args) {
		int arr[]= {1,1,2,3,1,3,2,2,1,3};
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			str=str+arr[i];
			
		}
//		System.out.println(str);
//		String.valueOf(str);
//		System.out.println(str);
//		
		int arr2[]=new int[123];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			arr2[ch]++;
			
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]!=0)
			{
				System.out.println((char)i+" is repeated for " + arr2[i]+" times");
			}
		}
	
	}

}
