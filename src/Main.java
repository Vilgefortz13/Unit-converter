import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("""
                Welcome to Unit Converter!
                1 - Convert kilometers to miles
                2 - Convert miles to kilometers
                Choose what to covert:\040""");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> kilometersToMiles();
            case 2 -> milesToKilometers();
            default -> System.out.println("Unexpected number!");
        }
    }

    public static void kilometersToMiles() {
        Scanner sc = new Scanner(System.in);
        final double milesToKm = 0.621371;
        System.out.print("Enter the number of kilometers: ");
        double km = sc.nextDouble();
        double miles = km * milesToKm;
        System.out.printf("%.2f km = %.2f miles", km, miles);
    }

    public static void milesToKilometers() {
        Scanner sc = new Scanner(System.in);
        final double kmToMiles = 1.60934;
        System.out.print("Enter the number of miles: ");
        double miles = sc.nextDouble();
        double km = miles * kmToMiles;
        System.out.printf("%.2f miles = %.2f km", miles, km);
    }
}