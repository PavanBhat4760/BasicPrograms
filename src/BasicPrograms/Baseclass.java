package BasicPrograms;

public class Baseclass extends Parentclass{
	
	String s2="Mumbai";
	
	
public void display() {
		
		System.out.println("Color is blue");
	}
	public static void main(String[] args) {
		Baseclass obj= new Baseclass();
		System.out.println(obj.s1);
		System.out.println(obj.s2);
		
		obj.display();
		obj.display();
		
		
		
		

	}

}
