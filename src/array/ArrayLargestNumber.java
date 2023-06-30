package array;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int arr[]= {5,9,1,6,3,2,4,10};
		for(int i=0;i<=arr.length-1;i++)
		{
			for( int j=i+1;j<=arr.length-1;j++)
			{               //first arranging numbers in descending order then u can easily find the largest element
				if(arr[i]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}System.out.print(arr[0]);
	}

}
