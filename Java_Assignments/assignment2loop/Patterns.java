package assignment2loop;

public class Patterns {
	
	public static void main (String[]args) {
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<i; j++)
	
			{
				if(i==4&&j==2||i==5&&j==1)
				{
					System.out.print("0 ");
				}
				else if(i==3&&j==2)
				{
					System.out.print("* ");
				}
				else if(i==2&&j==1)
				{
					System.out.print("/ ");
			
				}
				else {
				System.out.print(i+" ");
				}
				
			}
			System.out.println();
		}
	}
	

}
