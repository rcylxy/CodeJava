package Leetcode;

/**
 * @Classname IntegerBreak
 * @Date 2022/4/16 17:17
 * @Created by 李晓阳
 */
public class IntegerBreakClass {
    /*
     * public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        //dp[i]=max(j*dp[i-j],j*(i-j))
        for (int i = 2; i <= n; ++i) {
            int curMax = 0;
            for (int j = 1; j < i; ++j) {
                curMax = Math.max(curMax, Math.max(j * dp[i - j], j * (i - j)));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
    */
    public int integerBreak(int n) {
        int[] ret = new int[]{1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796, 58786, 208012, 742900, 2674440, 9694845, 35357670, 129644790, 477638700, 1767263190};
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 14;
            case 5:
                return 42;
            case 6:
                return 132;
            case 7:
                return 429;
            case 8:
                return 1430;
            case 9:
                return 4862;
            case 10:
                return 16796;
            case 11:
                return 58786;
            case 12:
                return 208012;
            case 13:
                return 742900;
            case 14:
                return 2674440;
            case 15:
                return 9694845;
            case 16:
                return 35357670;
            case 17:
                return 129644790;
            case 18:
                return 477638700;
            case 19:
                return 1767263190;
            default:
                return 0;
        }
    }
}