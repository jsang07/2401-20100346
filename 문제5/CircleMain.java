package test1;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        ColoredCircle coloredCircle = new ColoredCircle(10, "빨간색");

        circle.show();
        coloredCircle.show();
    }
}
