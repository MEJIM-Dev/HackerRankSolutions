package JavaBasics;

import java.util.*;

public class JavaStrings {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        solutionTwo(A,B);

    }

    public static void solution(String A,String B) {
        String word = String.valueOf(Character.toUpperCase(A.charAt(0)));
        for(int i = 1; i<A.length(); i++){
            word += A.charAt(i);
        }
        word+=" "+String.valueOf(Character.toUpperCase(B.charAt(0)));
        for(int j = 1; j<B.length(); j++){
            word += B.charAt(j);
        }
        System.out.println(A.length()+B.length());
        String msg ="No";

        if(A.compareTo(B)>0){
            msg="Yes";
        }

        System.out.println(msg);

        System.out.println(word);
    }

    public static void solutionTwo(String A,String B) {
//        String word = String.valueOf(Character.toUpperCase(A.charAt(0)));
//        for(int i = 1; i<A.length(); i++){
//            word += A.charAt(i);
//        }
//        word+=" "+String.valueOf(Character.toUpperCase(B.charAt(0)));
//        for(int j = 1; j<B.length(); j++){
//            word += B.charAt(j);
//        }
        System.out.println(A.length()+B.length());
        String msg ="No";

        if(A.compareTo(B)>0){
            msg="Yes";
        }

        System.out.println(msg);

        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
    }
}