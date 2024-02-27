package BasicPrograms;
import java.util.Scanner;
public class factorialnum {

	public static void main(String[] args) {
		
		       
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();
		        
		        sc.close();
		        
		        // Calculate the factorial of the entered number
		        long factorial = 1;
		        for (int i = 1; i <= number; i++) {
		            factorial *= i;
		        }
		        
		        // Print the factorial
		        System.out.println("Factorial of " + number + " is: " + factorial);

	}

}
