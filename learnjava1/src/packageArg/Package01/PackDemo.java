package packageArg.Package01;
/*01背包问题*/

import java.util.Scanner;

public class PackDemo {
    private static final int MAXLINE = 35;
    private static final int MAXROW = 205;

    public static void printArray(int[][] a, int m, int n) {
//        for (int[] ints : a) {
//            for (int j = 0; j < a[0].length; ++j) {
//                System.out.print(ints[j] + " ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i <= m; ++i) {
            for (int j = 0; j <= n; ++j)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

    public static void printArray(int[] a, int n) {
        for (int i = 1; i <= n; ++i) {
            System.out.print(a[i] + " ");
        }
    }


    public static int packagefunc(int[] w, int[] c, int m, int n) {
        int[] dp = new int[MAXROW];
        for (int i = 1; i <= n; ++i) {
            for (int j = m; j >= 1; --j) {
                if (j >= w[i])
                    dp[j] = Math.max(dp[j], dp[j - w[i]] + c[i]);
            }
            printArray(dp, m);
            System.out.println();
        }
        return dp[m];
    }

    public static void main(String[] args) {
        int m, n;
        Scanner in = new Scanner(System.in);
        m = in.nextInt();   //容量
        n = in.nextInt();   //物品的数目
        int[][] a = new int[m][n];
        int[] w = new int[MAXLINE];
        int[] c = new int[MAXLINE];
        for (int i = 1; i <= n; ++i) {
            w[i] = in.nextInt();
            c[i] = in.nextInt();
        }

        System.out.println(packagefunc(w, c, m, n));

        /*
        10 4
        2 1
        3 3
        4 5
        7 9

         */


    }

}