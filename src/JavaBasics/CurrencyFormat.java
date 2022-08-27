package JavaBasics;
import java.util.*;
import java.text.*;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat china = NumberFormat.getCurrencyInstance(new Locale("zh","CN"));
        NumberFormat us = NumberFormat.getCurrencyInstance(new Locale("en","US"));
        NumberFormat france = NumberFormat.getCurrencyInstance(new Locale("fr","FR"));
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
