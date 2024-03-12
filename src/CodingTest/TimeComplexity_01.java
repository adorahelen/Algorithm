/*
package CodingTest;

public class TimeComplexity_01 {
    // 시간 제한이 2초, 따라서 2억 번 이하의 연산 횟수로 문제를 해결해야한다.

    public static void main(String[] args) {
        int N = 100000;
        int cnt = 0;
        for (int i = 0; i < N; i++){
            System.out.println("Calculating count:" + cnt++);
        }
    }
} // 연산 횟수가 N 인 경우
*/

/*package CodingTest;
public class TimeComplexity_01 {
    public static void main(String[] args) {
        int N = 100000;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Calculating count:" + cnt++);
        }

        for (int i = 0; i < N; i++) {
            System.out.println("Calculating count:" + cnt++);
        }

        for (int i = 0; i < N; i++) {
            System.out.println("Calculating count:" + cnt++);
        }
    }
} // 연산 횟수가 3N인 경우 */

package CodingTest;

public class TimeComplexity_01 {


    public static void main(String[] args) {
        int N = 100000;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Calculating count:" + cnt++);
            }
        }
    }
} // 연산 횟수가 N^2 경우
// 시간 복자도는 가장 많이 중첩된 반복문을 기준으로 도출한다.
// 일반 for 문이 10개 더 있으면 10N이다.