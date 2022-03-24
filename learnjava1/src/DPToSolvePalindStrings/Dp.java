package DPToSolvePalindStrings;

public class Dp {
    public static void printArray(boolean a[][]) {
        int lenOfI = a.length;
        int lenOfJ = a[0].length;
        for (int i = 0; i < lenOfI; ++i) {
            for (int j = 0; j < lenOfJ; ++j) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static String longestPalindrome(String out1) {
        int len = out1.length();
        if (len < 2) {
            return out1;
        }
        boolean[][] dp = new boolean[len][len];
        char[] s = out1.toCharArray();
        int i = 0;
        int j = 0;
        len = s.length;
        int max = 1;
        String ret = out1.substring(0, 1);
        for (j = 0; j < len; ++j) {
            for (i = j; i >= 0; --i) {
                if (s[i] == s[j]) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                        if (j - i + 1 > max) {
                            ret = out1.substring(i, j + 1);
                            max = j - i + 1;
                        }
                    } else if (dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        if (j - i + 1 > max) {
                            ret = out1.substring(i, j + 1);
                            max = j - i + 1;
                        }
                    }
                }
            }
        }
        printArray(dp);
        System.out.println();
        return ret;
    }


    public static void main(String[] args) {
        String s = "abcda";
        System.out.println(longestPalindrome(s));

    }
}
