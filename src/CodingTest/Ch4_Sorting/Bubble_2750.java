package CodingTest.Ch4_Sorting;

import java.util.Scanner;

public class Bubble_2750 {
    // 데이터의 인접 요소끼리 비교하고, swap 연산을 수행하며 정렬하는 방식
    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        int N = DCU.nextInt();
        int [] A = new int[N]; // 입력받은 정수만큼 배열 선언

        for (int i = 0; i < N; i++) {
            A[i] = DCU.nextInt();
        } // 배열에 정수들 입력

        for (int i = 0; i < N - 1; i++) { // 버블정렬 알고리즘
            for (int j = 0; j < N - 1 -i; j++) {
                if (A[j] > A[j + 1] ) {

                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

/*        for (int i = 0; i < N-1; i++) { // 기존 버블정렬 알고리즘
            for (int j = i+1; j < N; j++) {
                if (A[j] < A[i] ) {

                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }*/


        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}
