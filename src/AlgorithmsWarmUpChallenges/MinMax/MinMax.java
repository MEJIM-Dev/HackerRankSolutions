package AlgorithmsWarmUpChallenges.MinMax;

import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        Map<String,Integer> map = new HashMap<>();
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int i = 0; i <= arr.size()-4; i++) {
                long sum = arr.get(i) + arr.get(i+1)+arr.get(i+2)+arr.get(i+3);
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
//               }
                    System.out.println(min+" "+ max);
            }
        }
        System.out.println(min+" "+max);
    }
}
