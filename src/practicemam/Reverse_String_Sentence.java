package practicemam;

public class Reverse_String_Sentence {
	public static void main(String[] args) {
		
		String s1="Morgen guten hallo";
		String arr[]=s1.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] + " ");
			
		}
	}

}
