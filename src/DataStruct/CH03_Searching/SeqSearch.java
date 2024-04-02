package DataStruct.CH03_Searching;

import java.util.Scanner;

// 선형 검색
public class SeqSearch {
    // 요솟수가 n인 배열 a에서 key 와 값이 같은 요소를 선형으로 검색 =>
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while(true) {
            if (i == n)
                return -1; // 배열 할당이 안되어서, 검색에 실패한 경우(i가 0인데 배열도 0)

            if (a[i] == key)
                return i; // 검색에 성공한 경우 인덱스를 반환
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        System.out.print("설정할 배열의 크기: ");
        int num = DCU.nextInt();
        int [] x = new int[num]; // 입력받은 자연수 만큼 배열 설정

        for (int i =0; i < num; i++) {
            System.out.print("x: " + i + " ");
            x[i] = DCU.nextInt();
        }

        System.out.print("검색할 값: "); //  키 값 입력
        int ky = DCU.nextInt();

        int idx = seqSearch(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("ERROR: 값이 없거나, 할당이 안되었음");
        else
            System.out.println("그 값은 x["+ idx +"]에 있습니다.");
    }
}
