package BasicPrograms;

import java.util.Scanner;
public class ReverseEachWord {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 // Input string
 System.out.print("Enter the input string: ");
 String inputString = scanner.nextLine();

 // Reverse each word in the input string
 String result = reverseEachWord(inputString);

 // Output the result
 System.out.println("Result after reversing each word: " + result);

 scanner.close();
 }

 public static String reverseEachWord(String input) {
 String[] words = input.split("\\s+"); // Split the input string into words

 StringBuilder result = new StringBuilder();
 // Reverse each word and append it to the result
 for (String word : words) {
 result.append(reverseString(word)).append(" ");
 }
 return result.toString().trim();
 }

 public static String reverseString(String str) {
 StringBuilder reversed = new StringBuilder();
 for (int i = str.length() - 1; i >= 0; i--) {
 reversed.append(str.charAt(i));
 }
 return reversed.toString();

	}

}
