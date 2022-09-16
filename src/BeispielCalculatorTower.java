import java.util.Scanner;

public class BeispielCalculatorTower {

    public static void main(String[] args) {

        long number;
        long result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Startzahl eingeben: ");
        number = scanner.nextInt();

        result = number * 2;
        System.out.println(number + " * 2 =" + result);

    }
}
