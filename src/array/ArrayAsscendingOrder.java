package array;
public class ArrayAsscendingOrder {
	public static void main(String[] args) {
int temp=0;
int arr[]= {5,3,2,4};
for(int i=0;i<=arr.length-1;i++)
{
	for( int j=i+1;j<=arr.length-1;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	}
}for(int i=0;i<=arr.length-1;i++)
{
	

System.out.print(arr[i]+" ");
	}

}
}