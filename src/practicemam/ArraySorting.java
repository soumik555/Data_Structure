package practicemam;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		
		int arr[]= {90,56,102,33,4,6,95};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
