package array;

public class DupplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {5,6,5,6,2};
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=i+1;j<=arr.length-1;j++)
	{
		if(arr[i]==arr[j])
		{
			System.out.print(arr[i]+" ");
		}
	}
}
	}

}
