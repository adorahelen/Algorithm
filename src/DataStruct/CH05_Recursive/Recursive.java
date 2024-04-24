package DataStruct.CH05_Recursive;

import java.util.Scanner;

public class Recursive {

    static void recur (int n) {
        if ( n > 0) {
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = DCU.nextInt();

        recur(x);
    }
}
