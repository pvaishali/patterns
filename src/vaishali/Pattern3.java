package vaishali;

public class Pattern3 {

	public static void printPattern(int n)
    {
        int i, j;
        // outer loop to handle rows
        for (i = 0; i < n; i++) {
            // inner loop to print spaces.
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
  
            // inner loop to print stars.
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
  
            // printing new line for each row
            System.out.println();
        }}
   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 6;
	        printPattern(n);
		
}
}
