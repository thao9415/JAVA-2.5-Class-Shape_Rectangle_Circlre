public class Rectangle extends Shape {
    private double length = 1.0, width = 1.0;

    public Rectangle() {
    }


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return (this.length + this.width) * 2;
    }

    public double getPerimeter() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "A Rectangle with length = "
                + getLength()
                + " , width = "
                + getWidth()
                + (isFilled() ? " filled" : " not filled");
    }


}
