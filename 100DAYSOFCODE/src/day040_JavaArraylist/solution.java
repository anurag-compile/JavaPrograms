package day040_JavaArraylist;
import java.util.*;


public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array2d = new int[n][];
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            int[] subArray = new int[d];
            array2d[i] = subArray;
            for (int j = 0; j < d; j++) {
                array2d[i][j] = sc.nextInt();
            }
        }
        int q = sc.nextInt();
        int[] x = new int[q];
        int[] y = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < q; i++) {
            try {
                System.out.println(array2d[x[i] - 1][y[i] - 1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}

