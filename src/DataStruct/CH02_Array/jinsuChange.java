package DataStruct.CH02_Array;

import java.util.Scanner;

public class jinsuChange {

    static int Changer(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r); // 해당 위치에 있는 문자를 반환
            x /= r;
        } while (x != 0); // r로 나눈 나머지를 저장


        for (int i = 0; i < digits /2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i  -1] = t;
        }
        return  digits;

    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수 기수를 변환합니다.");
        do {
            do{
                System.out.println("변환하는 음이 아닌 정수: ");
                no = stdin.nextInt();

            }while (no <0);

            do {
                System.out.println("어떤 진수로 변환할까요? (2-256");
                cd = stdin.nextInt();
            } while (cd < 2 || cd > 36);

            dno = jinsuChange(no, cd, cno);

        }
    }
}
