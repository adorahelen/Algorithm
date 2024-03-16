package DataStruct.CH01;

import java.util.Scanner;
public class ch01_MAX3 { // 파일 이름과 클래스 이름은 동일해야 한다.
    public static void main(String[] args) {
        Scanner  stdIn = new Scanner(System.in);

        System.out.println("Input the Three Integer, We find the MAX");
        System.out.print("Value of A: "); int a = stdIn.nextInt();
        System.out.print("Value of B: "); int b = stdIn.nextInt();
        System.out.print("Value of C: "); int c = stdIn.nextInt();

        int max = a; // 일단 A를 최대값으로 기준 설정
        if (b>max) max = b;
        if (c>max) max = c;

        System.out.println("The most Big Number is \"" + max + "\"...");
    }

}
