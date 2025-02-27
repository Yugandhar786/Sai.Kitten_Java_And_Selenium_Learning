package assignment2loop;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		
		for(int i=1; i<=10; i++)
		{
			isEven(i);
			i=i+2;
		
		}

	}
	 public static void isEven(int a)
	 {
//		 boolean ans = false;
		 if(a%2==0)
		 {
			 System.out.println("Given number "+ a + " is Even");
		 }else {
				System.out.println("given number "+a+" is Odd ");
			}
		 
		 
	 }

}
