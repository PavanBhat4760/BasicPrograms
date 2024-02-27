package BasicPrograms;

import java.util.Scanner;
public class RemoveAdjacentDuplicates {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 // Input string
 System.out.print("Enter the input string: ");
 String inputString = scanner.nextLine();

 // Remove adjacent duplicates
 String result = removeAdjacentDuplicates(inputString);

 // Output the result
 System.out.println("Result after removing adjacent duplicates: " + result);

 scanner.close();
 }

 public static String removeAdjacentDuplicates(String input) {
 StringBuilder result = new StringBuilder();

 // Iterate through the input string
 for (int i = 0; i < input.length(); i++) {
 char currentChar = input.charAt(i);

 // If the current character is not equal to the next character, append it to the result
 if (i == input.length() - 1 || currentChar != input.charAt(i + 1)) {
 result.append(currentChar);
 } else {
 // Skip adjacent duplicates
 while (i < input.length() - 1 && currentChar == input.charAt(i + 1)) {
 i++;
 }
 }
 }
 return result.toString();

	}

}
