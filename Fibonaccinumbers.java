package week1.assignments;

public class Fibonaccinumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 1;
		
		 System.out.print("The Fibonacci numbers are : ");

		 System.out.print(a + " " + b + " ");

	        for (int i = 1; i <= 8; i++) {
	            int c = a + b;

	            if (c > 13) {
	                break;
	            }

	            System.out.print(c + " ");
	            a = b;
	            b = c;
        }

	}

}
