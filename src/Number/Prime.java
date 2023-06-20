package Number;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number to check whether its prime number or not");
int number=sc.nextInt();
int count=0;
for(int i=1;i<=number;i++)
{
	if(number%i==0)
	{
		count++;
	}
}if(count==2)
{
	System.out.println("number is prime number");
	
}else
{
	System.out.println("not a prime number");
}
	}

}
