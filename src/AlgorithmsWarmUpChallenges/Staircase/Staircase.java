package AlgorithmsWarmUpChallenges.Staircase;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void staircase(int n) {
        // Write your code here
        String charr = "#";
        String space = " ";
        for(int i = 0 ; i < n ; i++){
            String currChar = new String(new char[1+i]).replaceAll("\0", charr);
            String currSpaces = new String(new char[n-1-i]).replaceAll("\0", space);
            System.out.println(currSpaces+currChar);
        }

    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}

