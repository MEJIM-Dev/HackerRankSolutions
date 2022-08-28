package JavaBasics;

import java.util.*;

public class JavaSubStringsComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        Map<Integer,String> map = new HashMap<>();
        for(int i=0; i<=s.length()-k;i++){
            if(map.containsKey(s.substring(i,k+i))){
                continue;
            }
            if(i==0){
                smallest=s.substring(i,k+i);
                largest=s.substring(i,k+i);
                map.put(i,s.substring(i,k+i));
                continue;
            }
            map.put(i,s.substring(i,k+i));
            if(s.substring(i,k+i).compareTo(smallest)<0){
                smallest=s.substring(i,k+i);
                continue;
            }
            if(s.substring(i,k+i).compareTo(largest)>0){
                largest=s.substring(i,k+i);
            }

        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
