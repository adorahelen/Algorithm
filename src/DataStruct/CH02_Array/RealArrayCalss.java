package DataStruct.CH02_Array;

import java.util.Scanner;

public class RealArrayCalss {

    static final int VMAX = 21;

    static class PhyscData { // 클래스 안에 클래스
        String name;
        int height;
        double vision;

        // 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] dat) {
        double sum = 0;
        for (int i = 0; i < dat.length; i++)
            sum += dat[i].height;

        return sum / dat.length;
    } // 키의 평균 값을 구하는 함수 (클래스 안에 속한다)

    static void distVision (PhyscData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for ( i = 0; i < dat.length; i++)
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
    } // 이 부분 주의 **

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8),
        };
        int[] vdist = new int[VMAX]; // 시력분포


        System.out.println("---신체검사 리스트---");
        System.out.println("이름     키     시력");
        System.out.println("------------------");
        for(int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n",
                    x[i].name, x[i].height, x[i].vision);

        System.out.printf("\n 평균키: %5.1fcm\n", aveHeight(x));
        distVision(x, vdist); // 시력분포가 살짝 어려움

        System.out.println("\n 시력분포");
        for(int i = 0; i < VMAX; i++)
            System.out.printf("%3.1f~~: %2d명\n", i/10.0, vdist[i]);




    }





}
