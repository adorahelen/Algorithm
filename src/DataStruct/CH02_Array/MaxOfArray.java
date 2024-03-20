package DataStruct.CH02_Array;

import java.util.Scanner;

class MaxOfArray { // 가장 큰 객체 틀 선언
    static int maxOf(int[] a) { // 배열 a의 최대값을 구하여 반환 하는 함수*main 아님
        // 배열 []a를 argument:인자값으로 삼는다.
        int max = a[0]; // 일단 max 를 "배열의 시작 주소에 있는 값"으로 설정
        for (int i = 1; i < a.length; i++) // 배열의 길이만큼 반복하는데
            if (a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args) {// 찐 메인 함수 선언
        Scanner DCU = new Scanner(System.in);

        System.out.println("calculate what the Peoples height value.");
        System.out.print("Input the People Num : ");

        int num = DCU.nextInt();
        int [] height = new int[num]; // 요솟수가 num인 배열을 생성

        for (int i = 0; i < num; i++) {
            System.out.print("height[" + i + "]:"); // 배열 넘버 출력
            height[i] = DCU.nextInt(); // 넘버의 맞는 값 획득
        }
        System.out.println("The Max is" + maxOf(height)+ ".");

    }
}