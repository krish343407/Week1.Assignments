package week1.assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 8;        
        boolean isPrime = true;

        
        for (int i = 2; i <= input - 1; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }

       
        if (isPrime && input > 1) {
            System.out.println("The Input number is a Prime number");
        } else {
            System.out.println("The Input number is not a Prime number");
        }
  

	}

}
