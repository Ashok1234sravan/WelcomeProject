import java.util.Scanner;

class Leapyear
{
	public static void main(String []args)
	{
		
		int yr;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter year:");
		yr=scan.nextInt();
		if((yr%4==0) && (yr%100!=0))
		{
			System.out.println("this is a leap year");
		}
		else if(yr%100==0)
		{
			System.out.println("this is not a leap year");
		}
		else if(yr%400==0)
		{
			System.out.println("this is a leap year");
		}
		else
		{
			System.out.println("this is not a leap year");
		}
		
	}
}
