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
}