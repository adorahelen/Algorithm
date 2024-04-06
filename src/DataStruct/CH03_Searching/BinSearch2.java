package DataStruct.CH03_Searching;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BinSearch2 {

    static class PhysData {
        private String name;
        private int height;
        private double vision;

        // 생성자
        public PhysData(String name, int height, double vision) {
            this.name = name; this.height = height; this.vision = vision;
        }

        // 문자열로 만들어 반환하는 매서드
        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 키의 오름 차순으로 정렬하기 위한 comparator
        public static final Comparator<PhysData> HEIGHT_ORDER =
                new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhysData> {
            public int compare (PhysData d1, PhysData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }



    }

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);
        PhysData[] x = { // 키의 오름 차순 정렬
                new PhysData("강민하", 162, 0.3),
                new PhysData("이수연", 168, 0.4),

                new PhysData("황지안", 169, 0.8),
                new PhysData("유서범", 171, 1.5),
                new PhysData("김찬우", 173, 0.7),
                new PhysData("장경오", 174, 1.2),
                new PhysData("박준서", 175, 2.0),
        };
        System.out.print("키가 몇 cm 인 사람을 찾고 있으신가요?:  ");
        int height = DCU.nextInt(); // 키 값을 입력 받습니다.
        int idx = Arrays.binarySearch(
                x, //  배열 x 에서
                new PhysData("", height, 0.0), // 키가 height인 요소를
                PhysData.HEIGHT_ORDER // 이부분 아직 작성안함
        );

        if (idx < 0)
            System.out.println(" 그 값의 요소가 없습니다.");
        else {
            System.out.println(" 그 값은 x[" + idx + "]에 있습니다. ");
            System.out.println("찾은 데이터 : " + x[idx]);
            // 묵시적으로, toString 메서드가 자동으로 호출된다.
        }
    }
}
