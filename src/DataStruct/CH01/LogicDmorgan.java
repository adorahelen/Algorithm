package DataStruct.CH01;

import java.util.Scanner;

public class LogicDmorgan {
    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);
        int no;

        System.out.println(" input the Positive Num (2Digits)"); // 2자리수 = two digits

        do {
            System.out.println("no Value: ");
            no = DCU.nextInt();
        } while (no < 10 || no > 99);
        // !(no >= 10 && no <= 99) 논리회로, 드모르간 법칙

        System.out.println("variable NO value become " + no );
    }
}
/*
구조적 프로그래밍
입력하는 곳 하나와 출력하는 곳 하나를 갖는 구성 요소만을 사용하여,
이들을 계층적으로 배치하여 프로그램을 구성하는 방식을 말한다.
= 구조적 프로그래밍
이 구조적 프로그래밍은, 1. 순차 2. 선택 3. 반복
이라는 세 종류의 제어 흐름을 사용한다.
*/