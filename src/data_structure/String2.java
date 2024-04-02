package data_structure;
//reverse a given sentence
public class String2 {
	public static void main(String[] args) {
		String s1="Hello how are you";
		String arr[]=s1.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
		System.out.print(arr[i] + " ");
			
			
		}
	}

}
