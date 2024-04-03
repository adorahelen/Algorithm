package DataStruct.CH03_Searching;

import java.util.Scanner;

public class BinSearch1 {

    static int binSearch(int [] a, int n, int key) {
        int pageFirst = 0; // 검색 범위의 첫 인덱스
        int pageLast = n - 1; // 검색 범위의 끝 인덱스

        do {
            int pageCenter = (pageFirst + pageLast) / 2; // 중앙 요소의 인덱스 를 저장한다.
            if (a[pageCenter] == key)
                return pageCenter; // 검색에 성공한 경우

            else if (a[pageCenter] < key)
                pageFirst = pageCenter + 1; // 검색 범위를 뒤쪽 절반으로 좁힘

            else
                pageLast = pageCenter - 1; // 검색 범위를 앞쪽 절반으로 좁힘
        } while (pageFirst <= pageLast); // 처음과 끝이 같아 질 때 까지 반복

        return -1; // 검색 실패
        }

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        System.out.print("설정할 배열의 크기 지정 : ");
        int num = DCU.nextInt();
        int []x = new int[num]; // 입력받은 num 크기 만큼 배열 설정 (동적할당)

        System.out.println("오름차순으로 입력하시오 (small to big) !");

        System.out.print("x[0]: ");
        x[0] = DCU.nextInt();

        for (int i = 1; i < num; i++) {
            do { // 오름 차순으로 하기 위해서 바로 이전의 요소보다 작으면 다시 입력 받도록
                System.out.print("x[" + i + "]: ");
                x[i] = DCU.nextInt();
            } while (x[i] < x[i-1]); // 비교해서 작은 경우에 re:
        }

        System.out.print("검색할 키 값: ");
        int key = DCU.nextInt();

        int idx = binSearch(x, num, key); // 배열 x에서 값이 key인 요소를 검색
        // num은 검색 범위의 끝 인덱스 지정을 위해 사용

        if (idx == -1)
            System.out.println("그 값의 요소가 없거나, 검색에 실패하였습니다.");
        else
            System.out.println(" 그 값은 x[" + idx + "]에 있습니다.");
     }
}

