package assignment2loop;

import java.util.Scanner;

public class SwitchLoop {

	public static void main(String[] args) {
		// TODO Aut-generated method stub
		int[] a = {1000,1001,1002,1003};
		int a1;
//		for (int i=0; i<=3; i++)
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Student Rollnum: ");
		a1=sc.nextInt();
		sc.close();
		
		
		switch(a1) {
		
		
		case 1000:System.out.println("Sai");
		break;
		case 1001:System.out.println("Yuga");
		break;
		case 1002:System.out.println("Ram");
		break;
		case 1003: System.out.println("Krishna");
		break;
		default:System.out.println("Invalid Roll number");
		break;
	}

}
}