package DataStruct.CH01;

public class MultiTable {
    public static void main(String[] args) {
        System.out.println("--- X table ---");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j<=9; j++)
                System.out.printf("%3d", i*j);
            System.out.println();
        }
    }
}
