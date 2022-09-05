package AlgorithmsWarmUpChallenges.PlusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        double zeroRatio = 0.0;
        double posRatio = 0.0;
        double negRatio = 0.0;
        for(int i=0; i<arr.size();i++){
            if(arr.get(i)==0){
                zeroRatio++;
                continue;
            }
            if(arr.get(i)>0){
                posRatio++;
                continue;
            }
            if(arr.get(i)<0){
                negRatio++;
                continue;
            }
        }
        System.out.println(posRatio/arr.size());
        System.out.println(negRatio/arr.size());
        System.out.println(zeroRatio/arr.size());
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

