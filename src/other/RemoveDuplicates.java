package other;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=" java ooops is";
StringBuffer sb=new StringBuffer("");
for(int i=0;i<=str.length()-1;i++)
	{
	char ch=str.charAt(i);
	int index=str.indexOf(ch,i+1);
	if(index==-1)
	{
		sb.append(ch);
	}
	}System.out.println(sb);
	}

}
