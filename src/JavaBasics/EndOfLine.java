package JavaBasics;

import java.util.Scanner;

public class EndOfLine {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        while(scanner.hasNext()){
            System.out.println(counter+ " "+scanner.nextLine());
            counter++;
        }

    }
}
