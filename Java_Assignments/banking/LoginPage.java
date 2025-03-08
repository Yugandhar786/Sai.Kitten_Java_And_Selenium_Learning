package banking;

import java.util.Scanner;

public class LoginPage {
	public static void main(String[]args) {	
		lobby();
		
	}
	public static void lobby() {
		int a;
		System.out.println("*****************************");
		System.out.println("****** Welcome to SBI *******");
		System.out.println("*****************************\n");
		System.out.println("press 1 for login .");
//		System.out.println("press 2 for signup .");
		System.out.println("press 2 for exit .");
		Scanner obj = new Scanner(System.in);
		System.out.print("\nEnter your choice: ");
		a=obj.nextInt();
//		obj.close();
		if(a==1) {
			login();
	
		}
		else if (a==2) {
			exit();
			
			
			
		}
	}
	
	public static void login() {
		
		String[] userName = {"Admin", "sai"};
		
		String[] passWord = {"Ad@min", "S@i"};
		

//		for (int i =0; i<userName.length;i++)
//		{
//			System.out.println(userName[i]);
//			
//		}
	
		
		Scanner obj = new Scanner(System.in);
	
		int b=3;
		int c;int a1 = 0;
		
		while(b!=0) {
			
			String user,pass ;
			System.out.println("***********************");
			System.out.println("******* Login *********");
			System.out.println("***********************\n");
			System.out.print("Username : ");
			user = obj.nextLine();
			System.out.print("Password : ");
			pass = obj.nextLine();	
			
			System.out.println("UserName = "+user+" Password ="+pass+"\n");
			
			for (int j=0;j<userName.length;j++)
			{
				if(user.equals(userName[j]))
				{
					a1=j;
				}
				
				
			}
				if(user.equals(userName[a1])&&pass.equals(passWord[a1]))
				{
					System.out.println("Login Sucess");
					lobby();
//					break;
					
				}
				else {
					System.out.println("login failed\n");
					b--;
					System.out.println("you have" +b+"attempts left\n");
				}			
				
				
				
				}
		
			
	
				
			
			
		}
	public static int exit()
	{
		return 0;
	}
		
		
		
	}

	


