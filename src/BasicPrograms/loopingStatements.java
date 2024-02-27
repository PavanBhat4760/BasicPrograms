package BasicPrograms;

public class loopingStatements {

	public static void main(String[] args) {
		 
		System.out.println("Ascending order");
		 for (int i = 1; i <= 20; i++) {
			 if(i==5)
				continue;
	            System.out.println(i);
		 }
		 System.out.println("Descending order");
		 for (int i = 20; i >= 1; i--) {
	            System.out.println(i);
		 }
	}

}
