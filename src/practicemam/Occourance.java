package practicemam;

public class Occourance {
	public static void main(String[] args) {
		String s1="hellomamhowareyou";
		int arr[]=new int[123];
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			arr[ch]++;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print((char)i+"->"+ arr[i]+ " ");
				
			}
			
		}
		
		
	}

}
