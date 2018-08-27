package view;


// class example of a class hierarchy and polymorphism/late binding
public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3.14);
        shapes[1] = new Rectangle(2,4);
//        shapes[2] = new Shape(); // this worked until Shape became abstract
        shapes[2] = new Circle(10);

        shapes[0].move(10,20);

        for (Shape shape : shapes) {
            System.out.println(shape);
            shape.draw(); // the best version of .draw() is used
                          // it depends on the runtime type of the object
                          // inside the shape variable!
        }

        // example of overriding .equal for Shape objects
        if (shapes[0].equals(shapes[2])) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }
}
