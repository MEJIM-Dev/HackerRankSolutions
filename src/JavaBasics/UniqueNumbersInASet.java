package JavaBasics;

import java.util.*;

public class UniqueNumbersInASet {
    public static void main(String[] args) {
        fasterSolution();
    }

    public static void Solution() {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        int pos = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            int num = in.nextInt();
            deque.add(num);
            map.put(j, num);
        }
        for (int i = 0; i < m; i++) {
            set.add(map.get(pos));
            pos++;
            if(m-i==1){
                deque.remove();
                if(max<set.size()) max=set.size();
                if(max==m) break;
                pos=deque.getFirst();
                if(map.size()-deque.size()==m) break;
                i=-1;
            }
        }
        System.out.println(max);
    }

    public static void fasterSolution(){
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                if (max==m) break;
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }
        System.out.println(max);
    }
}