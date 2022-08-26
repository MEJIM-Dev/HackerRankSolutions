package WarmUpChallenges.Clouds;

import java.util.List;

public class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int i=0;
        int leastSteps=0;
        while(i<c.size()-1){
            if(i+2==c.size() || c.get(i+2)==1){
                i++;
                leastSteps++;
            } else{
                i+=2;
                leastSteps++;
            }

        }

        return leastSteps;
    }

}
