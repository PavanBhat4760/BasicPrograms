package BasicPrograms;

public class TriangleEg implements shapeInterface {
    private double base;
    private double height;

    TriangleEg(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        CircleEg circle = new CircleEg(5);
        System.out.println("Circle Area: " + circle.getArea());

        TriangleEg triangle = new TriangleEg(3, 4);
        System.out.println("Triangle Area: " + triangle.getArea());

	}

}
