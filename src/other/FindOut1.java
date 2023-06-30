package other;

public class FindOut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="str String 12356";
int uppercaseCount=0;
int lowercaseCount=0;
int digit=0;
int space=0;
for(int i=0;i<=str.length()-1;i++) {
	if(Character.isUpperCase(str.charAt(i))) //(str.charAt(i)>='A'&& str.charAt(i)<='Z')
	{
		uppercaseCount++;
	
	}else if(Character.isLowerCase(str.charAt(i)))//str.charAt(i)>='a'&& str.charAt(i)<='z')
	{
		lowercaseCount++;
	}
	else if(Character.isDigit(str.charAt(i)))//str.charAt(i)>='0'&& str.charAt(i)<='9')
	{
		digit++;
	}
	else if(str.charAt(i)==32)
	{
space++;
	}
	}

System.out.println("uppercase letter count"+uppercaseCount);
System.out.println("lowercase letter count"+lowercaseCount);
System.out.println("digits "+digit);
System.out.println("spaces "+space);
}}