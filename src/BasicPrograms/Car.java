package BasicPrograms;

public class Car extends Vehicle{
	@Override
    void drive() {
        System.out.println("Repairing a car");
    }
	
	public static void main(String[] args) {
		Car obj=new Car();
		obj.drive();

	}

}
