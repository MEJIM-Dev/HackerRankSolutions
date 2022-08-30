package JavaBasics;


import java.util.Scanner;

public class JavaRegexIPAddressValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        String num = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
        String regex= num+"\\."+num+"\\."+num+"\\."+num;
        System.out.println(text.matches(regex));
    }
}
