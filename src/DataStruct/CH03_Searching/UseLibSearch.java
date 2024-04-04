package DataStruct.CH03_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class UseLibSearch {

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        System.out.print(" 지정할 배열의 크기 : ");
        int num = DCU.nextInt();
        int [] x = new int[num]; // 입력한 수 만큼 동적으로 배열 할당


        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = DCU.nextInt(); // 배열의 첫 요소를 먼저 입력 받는이유는??


        for (int i = 1; i < num; i++) { // 배열의 크기 만큼 돌릴껀데,
            do { // 돌릴 때 마다, 한번씩 확인해라, 무엇을? 아래에 내용을

                System.out.print("x[" + i + "]:  ");
                x[i] = DCU.nextInt();
                // 무조건 한번씩 입력을 받는데,
            } while (x[i] < x[i-1]); // 새롭게 입력 받는 i가 이전의 i 보다 큰 경우에만, 넘어가고 아니면 다시
            // 즉, 강제로 오름차순 하도록

        }

        System.out.print(" 검색할 키 값: ");
        int key = DCU.nextInt();

        int idx = Arrays.binarySearch(x, key); // 함수를 만들지 않고 라이브러리를 이용

        if (idx < 0)
            System.out.println(" 그 값의 요소는 존재하지 않습니다. ");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
