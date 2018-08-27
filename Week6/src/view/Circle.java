package view;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Circle.draw called rad=%.2f\n", radius);
    }

    @Override
    public String toString() {
        // we use Shape's version of toString
        // to help make Circle's version
        return super.toString() + " rad= " + radius;
    }
}
