package view;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        //super.draw(); // error - because Shape is now abstract
        System.out.printf("Rectangle.draw called (%.2f, %.2f)\n", width, height);
    }
}
