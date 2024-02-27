package BasicPrograms;

public class ThrowEg {

	public static void main(String[] args) {
		
		int age=5;
		
		if(age<18) {
			
			throw new ArithmeticException("Person is not eligible for voting");
		}

	}

}
