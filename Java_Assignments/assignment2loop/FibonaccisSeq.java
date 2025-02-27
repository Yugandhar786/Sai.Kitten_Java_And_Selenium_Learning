package assignment2loop;

public class FibonaccisSeq {
	public static void main(String[]args) {
		int a=0, b=1;
		int temp;
		System.out.print(a+" ");
		for(int i=0; i<8; i++)
		{
			 temp=a+b;
			 System.out.print(temp+" "); // 
			 //
			 a=b;
			 b=temp;
			 
			 			
		}
		
		
	}

}
