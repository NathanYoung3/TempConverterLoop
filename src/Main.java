import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validTemp = false;
        double tempC = 0;
        double tempF;
        boolean repeat = true;

        while (repeat) {
            do {
                System.out.println("Please enter a temperature in degrees C to be converted to degrees F:");
                if (scan.hasNextDouble()) {
                    tempC = scan.nextDouble();
                    validTemp = true;
                    scan.nextLine();
                } else if (scan.nextLine().equalsIgnoreCase("N")) {
                    repeat = false;
                    validTemp = true;
                } else {
                    System.out.println("You have entered an invalid temperature value. Please try again.");
                }
            } while (!validTemp);
            validTemp = false;

            if (repeat == true) {
                tempF = (tempC * 1.8) + 32;
                System.out.printf( "%-15s %10.2f","Degrees C: ", tempC);
                System.out.printf("\n%-15s %10.2f", "Degrees F: ", tempF);
                System.out.println();
            }
        }
    }
}