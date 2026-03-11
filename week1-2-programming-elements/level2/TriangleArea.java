import java.util.Scanner;

class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base;
        double height;

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        double areaInCm = 0.5 * base * height;

        double conversionFactor = 2.54;
        double areaInInches = areaInCm / (conversionFactor * conversionFactor);

        System.out.println("The Area of the triangle in sq in is "
                + areaInInches + " and sq cm is "
                + areaInCm);

        input.close();
    }
}