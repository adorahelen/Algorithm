package CodingTest.Ch4_Sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 버블 소트가 한번도 일어나지 부분을 찾는 문제
public class BubbleSorting {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        mData[] A = new mData[N];

        for( int i = 0; i < N; i++) {
            A[i] = new mData(Integer.parseInt(reader.readLine()) , i);
        }

        Arrays.sort(A);
        int MAx = 0;
        for (int i = 0; i < N; i++) {
            if (MAx < A[i].index - i)
                MAx = A[i].index - i;
        }
        System.out.println(MAx+1);

    }
}

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super();
        this.value = value;
        this.value = index;
    }


    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}
