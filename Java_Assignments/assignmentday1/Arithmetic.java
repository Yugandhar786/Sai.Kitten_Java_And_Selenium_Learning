package assignmentday1;

public class Arithmetic { 
		
	
	public static void main(String[]args) {
		int a = 10;
		int b = 40;
		
		Arithmetic obj = new Arithmetic();
		int result = obj.sum(a, b);
		System.out.println("Sum is : " + obj.sum(a, b));
		System.out.println("sub is : "+ obj.sub(a, b));
		System.out.println("mul is : "+ obj.mul(a, b));
		System.out.println("div is : "+obj.div(a, b));
		
		result+=20;
		System.out.println("Sum is : " + result);

	
		
	}
	
	public int sum(int a, int b) {
//		int sum = a+b;
		return a+b;	
		

}
	public int sub(int a,int b)
	{

		return a-b;
		
		
	}
	public  int mul(int a,int b) {
				
		return a*b;
			
		
	}
	public int div(int a,int b)
	{
		return b/a;
	}
	
	
}


