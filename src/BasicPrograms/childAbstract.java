package BasicPrograms;

public class childAbstract extends egAbstract {

	
	void display() {
		System.out.println("Displaying data");
	}
	
	public static void main(String[] args) {
		egAbstract obj = new childAbstract();
		
		obj.display();
		obj.print();

	}

}
