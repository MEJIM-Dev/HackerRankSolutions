package JavaBasics;

import java.util.Scanner;
import java.util.regex.*;

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        int i=0;
        while(testCases>i){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(Exception e){
                System.out.println("Invalid");
            }

            i++;
        }
    }
}



