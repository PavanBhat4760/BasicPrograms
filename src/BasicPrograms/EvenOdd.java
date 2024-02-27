package BasicPrograms;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        sc.close();

        // Check if the number is odd or even and print the result
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
	}

}
