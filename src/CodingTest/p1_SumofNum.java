package CodingTest;

//브론즈2, 백준 온라인 저지 11720번: 숫자의 합 구하기
// N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
// 입력으로 주어진 숫자 N개의 합을 출력한다.

import java.util.Scanner;
public class p1_SumofNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 처음에 입력받는 것은 몇개의 숫자를 받아들일지
        // 입력값을 String형 변수에 (선)저장하고 char[] 형 변수로 변환하기

        String sNum = sc.next(); // 숫자의 배열을 받아들이고
        char[] cNum = sNum.toCharArray(); // 이를 다시 문자형으로 변환한다.

        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // 변환한 숫자들을 sum에 더하여 누적하기
        }
        System.out.println(sum);
    }
}
