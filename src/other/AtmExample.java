package other;
import java.util.Scanner;
public class AtmExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance=10000;
		int deposit=0;
		int withdraw=0;
Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("welcome to our ATM");
	System.out.println("choose 1 for withdraw");
	System.out.println("choose 2 for deposit");
	System.out.println("choose 3 for check your account balance");
	System.out.println("choose 4 for exit");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1 :
		System.out.println("enter withdraw amount");
		withdraw=sc.nextInt();
		if(balance>withdraw)
	      {  
			balance=balance-withdraw;
			System.out.println("After withdrawn"+balance);
		  }else
			{
				System.out.println("insufficient balance");
			}break;
			
	case 2:
		System.out.println("Enter amount for deposit");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("after deposit"+balance);
		break;
	case 3:
		System.out.println("ur current balance is:=>"+balance);
		break;
	case 4:
		System.exit(0);
	}
}}
}
