package BasicPrograms;

public class OperatorsExample {

	    int a = 10;
	    double b = 9.8;

	    public void operations() {
	    	//Addition
	    	double Addition = a + b;
	        System.out.println("Addition: " + Addition);
	        // Subtraction
	        double Subtraction = a - b;
	        System.out.println("Subtraction: " + Subtraction);

	        // Multiplication
	        double Multiplication = a * b;
	        System.out.println("Multiplication: " +Multiplication);

	        // Division
	        double Division = a / b;
	        System.out.println("Division: " + Division);
	        //modulus
	        double Modulus=a%b;
	        System.out.println("Modulus:"+Modulus);
	    }

	    public static void main(String[] args) {
	        // Create an object of the class
	        OperatorsExample ob = new OperatorsExample();
	        ob.operations();
	    }
	}
