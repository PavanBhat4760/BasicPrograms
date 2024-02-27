package BasicPrograms;

public class MethodoverrideChild extends MethodoverrideParent{
	String color="White";
	
	public static void main(String args[]) {
		MethodoverrideChild obj = new MethodoverrideChild();
		System.out.println(obj.color);
	}

}
