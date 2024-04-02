package DataStruct.CH03_Searching;

import java.util.Scanner;

public class sentrySearch {

    static int Sentray(int[]a, int n, int key) {
        int i = 0;

        a[n] = key; // 검색할 키를 보초로, 배열 a의 n번째 인덱스에 대입한다.

        while(true) {
            if (a[i] == key)
                break;
            i++;
        } // ***보초법에 핵심은 if 문을 하나만 사용해서 비용을 줄인 것이다.
        return i == n ? -1 : i;
        // i가 n이 맞으면 -1 반환 아니면 i 반환
        // 배열의 원래 데이터가 아니라 보초이기에 -1 반환,  맞으면 키 값이라 i 값 반환
    }

    public static void main(String[] args) {
        System.out.print("배열의 길이: ");

        Scanner DCU = new Scanner(System.in);
        int num = DCU.nextInt();
        int[]x = new int[num + 1]; // 배열을 설정 할때, 요솟수 +1 하는 이유 : 보초병

        for(int i = 0; i < num; i++) {// 요솟수 만큼 반복
            System.out.print("x[" + i + ": ");
            x[i] = DCU.nextInt();
        }

        System.out.print("검색할 값: "); // 키 값을 입력받음
        int ky = DCU.nextInt();

        int idx = Sentray(x, num, ky);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "] 에 있습니다. ");
    }
}
