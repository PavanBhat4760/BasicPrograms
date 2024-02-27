package BasicPrograms;
import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();		
	        sc.close();
	        
	        boolean isPrime = true;
	        
		// If the number is less than or equal to 1, it's not prime
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	        	// Check for factors from 2 to half of the number
	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	}

}
