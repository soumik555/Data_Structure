package data_structure;

public class Frequency2 {
	public static void main(String[] args) {
		
		String s1="aaabbqqhhccccc";
		int arr[]=new int[123];
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			arr[ch]++;
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0 && arr[i]==2)
			{
				
					System.out.println((char) i + " ->" + arr[i]);
					
				
				
			}
			
			
		}
		
		
	}

}
