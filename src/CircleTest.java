public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle=new Circle(10d,"redredred",true);
        System.out.println(circle);
        circle=new Circle(1.5);
        System.out.println(circle);
    }
}
