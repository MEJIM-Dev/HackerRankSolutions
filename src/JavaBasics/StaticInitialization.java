package JavaBasics;

import java.util.Scanner;

public class StaticInitialization {
    static boolean flag = true;
    static int B,H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = Integer.parseInt(scanner.nextLine());
        H = Integer.parseInt(scanner.nextLine());
        scanner.close();

        try {
            if(B<=0 || H<=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}
