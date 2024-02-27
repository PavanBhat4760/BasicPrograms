package BasicPrograms;

import java.util.Scanner;
public class RemoveCharacters {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Input string
 System.out.print("Enter the input string: ");
 String inputString = scanner.nextLine();
 // Characters to remove
 System.out.print("Enter the characters to remove: ");
 String charactersToRemove = scanner.nextLine();

 // Remove characters from input string
 String result = removeCharacters(inputString, charactersToRemove);

 // Output the result
 System.out.println("Result after removing characters: " + result);

 scanner.close();
 }

 public static String removeCharacters(String input, String charactersToRemove) {
 StringBuilder stringBuilder = new StringBuilder();
 boolean[] flags = new boolean[256]; // assuming ASCII characters

 // Mark characters to remove
 for (int i = 0; i < charactersToRemove.length(); i++) {
 flags[charactersToRemove.charAt(i)] = true;
 }
 // Append characters not marked for removal
 for (int i = 0; i < input.length(); i++) {
 if (!flags[input.charAt(i)]) {
 stringBuilder.append(input.charAt(i));
 }
 }
 return stringBuilder.toString();
	}

}
