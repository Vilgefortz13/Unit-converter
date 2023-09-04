import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("""
                Welcome to Unit Converter!
                1 - Convert miles to kilometers
                2 - Convert kilometers to miles
                Choose what to covert:\040""");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

    }

    public static void kilometersToMiles() {
        Scanner sc = new Scanner(System.in);
        final double milesToKm = 0.621371;
        System.out.print("Enter the number of kilometers: ");
        double km = sc.nextDouble();
        double miles = km * milesToKm;
        System.out.printf("%f km = %f miles", km, miles);
    }

    public static void milesToKilometers() {
        Scanner sc = new Scanner(System.in);
        final double kmToMiles = 1.60934;
        System.out.print("Enter the number of miles: ");
        double miles = sc.nextDouble();
        double km = miles * 1.60934;
        System.out.printf("%f miles = %f km", miles, km);
    }
}