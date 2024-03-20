package DataStruct.CH02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void swap(int [] a, int idx1, int idx2) { // 요소로 사용하는 것은 배열 하나, 변수 둘
        int temp = a[idx1]; a[idx1] = a[idx2]; a[idx2] = temp;
    }

    // 배열 a의 요소를 역순으로 설정
    static void reverse( int [] a) {
        for (int i =0; i < a.length /2; i++ ) // 길이가 10이면 5만큼 반복시킨다.
            swap(a, i, a.length-i-1); // 교환 ****
    }

    // swap 함수 정의, swap 함수를 => reverse 함수에서 사용 => main 에서 호출
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Num: ");
        int num = input.nextInt();
        int [] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" +i+ "] :");
            x[i] = input.nextInt();
        }

        reverse(x);

        System.out.println("All element be reversed");
        System.out.println("x = " + Arrays.toString(x));

    }

}
