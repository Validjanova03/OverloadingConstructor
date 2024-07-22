import java.util.Scanner;

public class Uchburchak2 {
    private double base;
    private double height;


    public Uchburchak2(double base, double height) {
        this.base = base;
        this.height = height;
    }


    public double calculateArea() {
        return 0.5 * base * height;
    }


    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();


        Uchburchak2 uch = new Uchburchak2(base, height);


        double area =uch.calculateArea();
        System.out.println("Area of the triangle: " + area);


        double perimeter = uch.calculatePerimeter();
        System.out.println("Perimeter of the triangle: " + perimeter);

        scanner.close();
    }
}
