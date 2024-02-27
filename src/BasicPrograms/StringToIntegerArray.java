package BasicPrograms;

import java.util.Scanner;
public class StringToIntegerArray {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 // Input string
 System.out.print("Enter the input string of integers separated by spaces: ");
 String inputString = scanner.nextLine();

 // Convert string to integer array
 int[] integerArray = convertStringToIntegerArray(inputString);

 // Output the integer array
 System.out.print("Integer Array: ");
 for (int num : integerArray) {
 System.out.print(num + " ");
 }

 scanner.close();
 }

 public static int[] convertStringToIntegerArray(String input) {
 // Split the input string by spaces
 String[] stringArray = input.split("\\s+");

 // Create an integer array to store the converted integers
 int[] integerArray = new int[stringArray.length];

 // Convert each string element to an integer and store it in the integer array
 for (int i = 0; i < stringArray.length; i++) {
 integerArray[i] = Integer.parseInt(stringArray[i]);
 }

 return integerArray;

	}

}
