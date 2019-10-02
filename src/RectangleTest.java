public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(1.5, 2.5);
        double area = rectangle.getArea();
        System.out.println(area);
        rectangle = new Rectangle(1.5,2.5,"cyan",false);
        System.out.println(rectangle.toString());


    }

}
