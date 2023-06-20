package Number;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum;
int num1=0;
int num2=1;
System.out.print(num1+" "+num2);
for(int i=2;i<=11;i++)
{
	sum=num1+num2;
	System.out.print(" "+sum);
	num1=num2;
	num2=sum;
}
	}

}
