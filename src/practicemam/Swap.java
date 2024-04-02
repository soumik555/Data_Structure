package practicemam;





public class Swap {
	
	
	static void swap()
	{
		int a=3;
		int b=9;
		System.out.println("Value of a Before Swapping is:" + a);
		System.out.println("Value of b Before Swapping is:" + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a After Swapping is:" + a);
		System.out.println("Value of b After Swapping is:" + b);
		
		
	}
	public static void main(String[] args) 
	{
		swap();
		
	}

	
	
}
