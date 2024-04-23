package DataStruct.CH05_Recursive;

import java.util.Scanner;

public class Euclid {

    static int dcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return dcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print(" 정수를 입력하세요. : "); int x = DCU.nextInt();
        System.out.print(" 정수를 입력하세요. : "); int y = DCU.nextInt();

        System.out.println(" 최대공약수는 " + dcd(x, y) + "입니다.");
    }
}
