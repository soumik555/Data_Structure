package data_structure;
//find the frequency of elements from the given number
public class Frequency4 {
	public static void main(String[] args) {
	  int no=11223344;
	  
	  int arr[]=new int[123];
	   
	  String str=String.valueOf(no);
	  System.out.println(str);
	  
	  for(int i=0;i<str.length();i++)
	  {
		  char ch=str.charAt(i);
		  arr[ch]++;
		  
	  }
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]!=0)
		  {
			  System.out.println((char)i+ " repeated for " + arr[i] + " times");
		  }
		  
	  }
	  
	}

}
