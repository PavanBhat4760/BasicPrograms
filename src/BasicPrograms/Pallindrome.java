package BasicPrograms;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); 
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // 
            }
            left++;
            right--;
        }
        return true; // If all characters match, it's a palindrome

	}

}