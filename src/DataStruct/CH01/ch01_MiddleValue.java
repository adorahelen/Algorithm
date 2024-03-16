package DataStruct.CH01;

import  java.util.Scanner;

class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;

        else if (a <= c)
            return a;

        else
            return c;


        else if (a > c)
            return a;


        else if (b > c)
            return c;

        else
            return b;
    }
}



public class ch01_MiddleValue {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Input The Three Value.");
        System.out.print("Value of A: ");
        int a = stdIn.nextInt();
        System.out.print("Value of B: ");
        int b = stdIn.nextInt();
        System.out.print("Value of C: ");
        int c = stdIn.nextInt();

        System.out.println("The middle value is" + Median.med3(a, b,c) + "...");
    }
} // 이게 더 좋은코드


/*package DataStruct;

import  java.util.Scanner;

class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;

            else if (a <= c)
                return a;

            else
                return c;


        else if (a > c)
            return a;


        else if (b > c)
            return c;

        else
            return b;
    }





    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Input The Three Value.");
        System.out.print("Value of A: ");
        int a = stdIn.nextInt();
        System.out.print("Value of B: ");
        int b = stdIn.nextInt();
        System.out.print("Value of C: ");
        int c = stdIn.nextInt();

        System.out.println("The middle value is" + med3(a, b, c) + "...");
    } // 한 클래스 내에 두개다 정의 되어 있음 첫번째 보다 안좋음
}*/
