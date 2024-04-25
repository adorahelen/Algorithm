package DataStruct.CH05_Recursive;

import java.util.Scanner;

public class RecurMemo {

    static String[] memo;

    static void recur(int n) {
        if (memo[n + 1] != null)
            System.out.print(memo[n + 1]); // 메모를 출력

        else {
            if (n > 0) {
                recur(n -1);
                System.out.println(n);
                recur(n -2);
                memo[n+1] = memo[n] + n + "\n" + memo[n - 1]; // 메모화
            } else {
                memo[n + 1] = "";
            }
        }

    }

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        System.out.print(" 정수를 입력하세요. : ");
        int x = DCU.nextInt();

        memo=new String[x + 2];
        recur(x);
    }
}
