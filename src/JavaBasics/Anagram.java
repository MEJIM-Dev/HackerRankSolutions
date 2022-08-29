package JavaBasics;


public class Anagram {

    static boolean isAnagram(String a, String b) {
        java.util.Map<Character,Integer> map =
                new java.util.HashMap<>();
        boolean ans = true;
        if(a.length()!=b.length()){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            char cur =Character.toLowerCase(a.charAt(i));
            map.put(cur, map.getOrDefault(cur, 0)+1);
        }

        for(int j = 0; j<b.length(); j++){
            char cur =Character.toLowerCase( b.charAt(j));
            if(!map.containsKey(cur) || map.get(cur)==0){
                ans=false;
                break;
            }
            map.put(cur,map.get(cur)-1);

        }

        return ans;
    }

    public static void main(String[] args) {