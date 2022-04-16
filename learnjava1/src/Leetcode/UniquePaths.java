package Leetcode;

import java.util.Arrays;

/**
 * @Classname UniquePaths
 * @Date 2022/4/16 10:06
 * @Created by 李晓阳
 */
public class UniquePaths {
    public static void printArray(int[][] dp, int m, int n) {
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; ++i) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        //printArray(dp, m, n);
        return dp[m - 1][n - 1];
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i) {
            if (obstacleGrid[i][0] != 0) {
                dp[i][0] = 0;
                break;
            } else if (obstacleGrid[i][0] == 0)
                dp[i][0] = 1;
        }
        for (int i = 0; i < n; ++i) {
            if (obstacleGrid[0][i] != 0) {
                dp[0][i] = 0;
                break;
            } else if (obstacleGrid[0][i] == 0)
                dp[0][i] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (obstacleGrid[i][j] != 0) {
                    dp[i][j] = 0;
                } else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
//        printArray(dp, m, n);
        return dp[m - 1][n - 1];

    }

    public static void main(String[] args) {
        int m = 3;
        int cnt = 0;
        int n = 2;
        int[] res = new int[]{0, 0, 1, 1, 0, 0};
        int[][] obstacleGrid = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                obstacleGrid[i][j] = res[cnt];
                cnt++;
            }
        }

        System.out.println("ret=" + uniquePathsWithObstacles(obstacleGrid));


    }
}
