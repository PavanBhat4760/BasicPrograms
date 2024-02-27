package BasicPrograms;

public class Triangle extends Shape {
	private double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle circle = new Circle(5);
	        System.out.println("Circle Area: " + circle.calculateArea());
	        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

	        Triangle triangle = new Triangle(3, 4, 5);
	        System.out.println("Triangle Area: " + triangle.calculateArea());
	        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

	}

}
