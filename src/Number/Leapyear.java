package Number;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year=2020;
if((year%400==0)||((year%4==0)&&(year%100!=0)))
{
	System.out.println("leap year");
}else
{
	System.out.println(" not a leap year");
}
	}

}
