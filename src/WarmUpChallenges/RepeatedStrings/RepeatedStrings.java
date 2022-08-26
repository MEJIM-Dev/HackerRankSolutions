package WarmUpChallenges.RepeatedStrings;

public class RepeatedStrings {

    public static void main(String[] args) {
        System.out.println(FasterSolution(10, "aba"));
    }

    public static int Solution(int n,String s){

        int counts = 0;
        int occurance = 0;
        boolean done = false;
        while(!done){
            for(int i= 0; i<s.length();i++){
                if(String.valueOf(s.charAt(i)).equals("a")){
                    occurance++;
                }
                counts++;
                if(n==counts){
                    done=true;
                    break;
                }
            }
        }

        return occurance;
    }

    public static long FasterSolution(int n,String s ) {
        // Write your code here
        long occurance = 0;
        boolean done = false;
        long ocurInString=0;
        long charLeft = (long) n%s.length();
        long mul = (long) n/s.length();
        long remCount=0;

        for(int i = 0; i<s.length();i++){
            if(String.valueOf(s.charAt(i)).equals("a")){
                ocurInString++;
            }
        }
        for (int j=0;j<charLeft;j++){
            if(String.valueOf(s.charAt(j)).equals("a")){
                remCount++;
            }
        }
        occurance=(ocurInString*mul)+remCount;
        return occurance;
    }
}
