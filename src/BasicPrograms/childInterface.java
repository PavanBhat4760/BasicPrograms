package BasicPrograms;

public class childInterface implements Interface1{
	
	public void read() {
		System.out.println("Reading");

	}
	public void write() {
		System.out.println("writing");

	}

	public static void main(String[] args) {
		
		childInterface obj = new childInterface();
		obj.read();
		
		obj.write();
		
		System.out.println(obj.s1);
	}

}
