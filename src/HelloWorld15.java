import java.util.Scanner;

public class HelloWorld15 {
    //psvm + TAB
    public static void main(String[] args) {

        // sout +TAB
        System.out.println("Hello World");


        int numberOne = 9; // 4 byte = 32 Bit
        int numberTwo;  // declaration

        numberTwo = 5;  // initialisierung

        int summe = numberOne + numberTwo;
        System.out.println(numberOne + " + " + numberTwo + " = " + summe);

        //System.out.println(numberOne + " - " + numberTwo + " = " + resultSubtraction);

        System.out.println(numberOne + "*" + numberTwo + " = " + (numberOne * numberTwo));

        System.out.println(numberOne + "/" + numberTwo + " =" + ((numberOne + 1.0) / numberTwo));


        System.out.println();


        Scanner scanner  = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein:");

        numberOne = scanner.nextInt();


    }
}
