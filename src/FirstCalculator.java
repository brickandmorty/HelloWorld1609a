public class FirstCalculator {
    //psvm
    public static void main(String[] args) {

        int number1 = 9;
        int number2 = 0;

        System.out.println("Zahl 1: " + number1);
        number2 = 5;
        System.out.println("Zahl 2: " + number2);

        int summe = number1 + number2;
        //System.out.println(number1 + " + " + number2 + " = " + summe);
        System.out.println(number1);
        System.out.println("+");
        System.out.println(number2);
        System.out.println("=");
        System.out.println(summe);
        System.out.println();

        int resultSubtraktion = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + resultSubtraktion);


        int number3 = 7;
        int number4 = 1;

        System.out.println("Zahl 3: " + number3);
        number3 = 7;
        System.out.println("Zahl 4: " + number4);
        number4 = 1;

        summe = number3 * number4;

        System.out.println(number3);

        // von oben code wiederolen nur mit division


        int resultMultiplication = number1 * number2;
        System.out.println(number1 + "*" + number2 + "=" + resultMultiplication);

        double numberDouble2 = number2;
        double resultDivide = number1 / number2;
        System.out.println(number1 + " / " + number2 + "=" + resultDivide);

        int resultModulo = number1 % number2;
        System.out.println(number1 + "%" + number2 + "=" + resultModulo);

    }
}
