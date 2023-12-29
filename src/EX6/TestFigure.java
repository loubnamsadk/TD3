package EX6;

public class TestFigure {
    public static void main(String[] args) {
        Disque disque1 = new Disque();
        System.out.println(disque1);

        Point centre = new Point(2.0, 3.0);
        Disque disque2 = new Disque(centre, 5.0, "Grand Disque");
        System.out.println(disque2);

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(4.0, 6.0, "Grand Rectangle");
        System.out.println(rectangle2);

        System.out.println("Perimeter of Grand Disque: " + disque2.getPerimeter());
        System.out.println("Area of Grand Disque: " + disque2.getArea());

        System.out.println("Perimeter of Grand Rectangle: " + rectangle2.getPerimeter());
        System.out.println("Area of Grand Rectangle: " + rectangle2.getArea());
    }
}


