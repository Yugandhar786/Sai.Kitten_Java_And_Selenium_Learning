package A2interfaceInJava;

public class Interface_Practice1 {
	static int a1=1,b1=2;

	static Interface_Practice obj=new Class2();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		obj.mul();
		obj.mul();
		System.out.println("vaule of a1 is = "+a1+" Value of b1 is = "+b1);
		a1=Interface_Practice.a;
		b1=Interface_Practice.b;
		int c=Interface_Practice.add();
		System.out.println("vaule of a1 is = "+a1+" Value of b1 is = "+b1);
		System.out.println("vaule of a1 is = "+c);		
	}

}


class Class2  implements Interface_Practice {
	static int a=500,b=600;
	
	public void method133()
	{
		
		
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("I am mul from Class2");
		
		int c=a+b;
		System.out.println("Value of C is = "+c);
	}
	
}


class Class1 implements Interface_Practice {
	
	int a=10;
	
	public void method1()
	{
		
	}
	public void add() {
		
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	public void mul()
	{
		System.out.println("I am Mul from Class1");
		int c=a*b;
		System.out.println("Value of C is = "+c);

		
	}
	
	
}
