package BasicPrograms;

public class MultiplechildInterface implements interfaceprog1, interfaceprog2 {

	public void writestatus() {
		System.out.println("writing");
	}
	
	public void readstatus() {
		System.out.println("reading");
	}
	
	
	public static void main(String[] args) {
		 MultiplechildInterface obj = new  MultiplechildInterface();
		
		 obj.readstatus();
		
		obj.writestatus();

	}

}
