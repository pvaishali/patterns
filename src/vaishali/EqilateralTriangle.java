package vaishali;

public class EqilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++) 
		 {
			for(int k=5;k>=j;k--) 
			 {
			System.out.print(" ");
			 }
		 for(int i=1;i<=2*j-1;i++) //inner loop for no of columns 
		 {
		 System.out.print("*");
		 }
		 System.out.println();
	}

	}

}
