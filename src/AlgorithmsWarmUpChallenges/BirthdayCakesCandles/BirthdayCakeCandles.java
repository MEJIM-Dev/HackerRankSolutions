package AlgorithmsWarmUpChallenges.BirthdayCakesCandles;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {


    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<candles.size();i++){
            int curr = candles.get(i);
            if(map.isEmpty()){
                map.put("max",curr);
                map.put("count", 1);
                continue;
            }
            if(map.get("max")==curr){
                map.put("count", map.get("count")+1);
                continue;
            }
            if(map.get("max")<curr){
                map.put("max", curr);
                map.put("count", 1);
                System.out.println("<");
                continue;
            }
        }
        return map.get("count");
    }

}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
