package InterviewChallenges.Arrays.ArrayLeftRotation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        int actualMoves = d%a.size();
        if(actualMoves==0){
            return a;
        }
        ans = a.subList(actualMoves,a.size());
        List<Integer> li = a.subList(0, actualMoves);
        System.out.println(ans);
        System.out.println(li);
        ans.addAll(li);
        return ans;
    }

}

public class ArrayLeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.rotLeft(a, d);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

