package File;

public class MethodOverloading {
	static int sum(int a,int b)
	{
		return a+b;
	}  
	static int sum(int a,int b,int c)
	{
		return a+b+c;
	} 
	static int multiplication (int a,int b)
	{
		return a*b;
	}  
	static int multiplication (int a,int b,int c)
	{
		return a*b*c;
	}  
	public static void main(String[] args) {
		
		System.out.println("Sum is : "+MethodOverloading.sum(2, 3));
		System.out.println("Sum is : "+MethodOverloading.sum(2, 3,5));
		
		System.out.println("Multiplication is : "+MethodOverloading.multiplication(2, 3));
		System.out.println("Multiplication is : "+MethodOverloading.multiplication(2, 3,5));


	}

}
