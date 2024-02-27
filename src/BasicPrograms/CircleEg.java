package BasicPrograms;

public class CircleEg implements shapeInterface {
    private double radius;

    CircleEg(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
