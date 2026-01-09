package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 11155111;     // Given number
        int output = 0;      // To store reversed number

        // for loop to reverse the number
        for (int i = input; i > 0; i = i / 10) {
            int rem = i % 10;            // get last digit
            output = output * 10 + rem;  // build reversed number
        }

        // Check palindrome
        if (input == output) {
            System.out.println("The Input number is a Palindrome");
        } else {
            System.out.println("The Input number is not a Palindrome");
        }

	}

}
