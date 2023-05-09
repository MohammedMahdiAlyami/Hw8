public class Main {
    public static void main(String[] args) {


        double r = 6.0;
        Circle c1 = new Circle("green",true,6.0);
        System.out.println("Radius of the circle="+r);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());

        System.out.println("------------------------");

        Rectangle rectangle = new Rectangle("red",true,6,20.0);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

}
}