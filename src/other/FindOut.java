package other;

public class FindOut {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finding vowels and consonants
		String str="FindOut vowel";
		String str1=str.toLowerCase();
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<=str1.length()-1;i++)
		{
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
			{
				vowelCount++;
			}else if(str1.charAt(i)>='a'&& str1.charAt(i)<='z')
			{
				consonantCount++;
			}
		}
			System.out.println(vowelCount);
			System.out.println(consonantCount);
			

	}

}
