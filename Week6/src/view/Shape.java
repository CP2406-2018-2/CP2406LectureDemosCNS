package view;

// an abstract class can have 0 or more abstract methods
// an abstract class can NOT be used to create objects directly
public abstract class Shape {
    private int x,y;
    abstract public void draw();

    // an abstract class can contain non-abstract members
    public void move(int xOffset, int yOffset) {
        this.x += xOffset;
        this.y += yOffset;
    }

    @Override
    public String toString() {
        return "Shape: " + x + " " + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) return false;
        Shape other = (Shape) obj; // downcast from Object to Shape
        return this.x == other.x && this.y == other.y;
    }
}
