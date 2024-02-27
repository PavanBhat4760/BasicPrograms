package BasicPrograms;

public class MethodOverloadingExample {
	
	static void printMessage(String message) {
        System.out.println(message);
    }

    // Method with two parameters of different types
    static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    // Method with three parameters of different types
    static void printMessage(int times, String message, double number) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
        System.out.println(number);
    }

    // Method with default parameters
    static void printMessage() {
        System.out.println("No message provided");
    }

    public static void main(String[] args) {
        
        printMessage("Hello");
        printMessage("Hi", 3);
        printMessage(2, "Hola",4.456);
        printMessage();
    }

}
