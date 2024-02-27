package BasicPrograms;
import java.util.*;
public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the list of integers : ");
        String input = scanner.nextLine();

        try {
            String[] numbers = input.split("\\s+");
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i].equals(numbers[j])) {
                        throw new IllegalArgumentException("Duplicate number found: " + numbers[i]);
                    }
                }
            }
            System.out.println("No duplicates found in the list.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

	}

}
