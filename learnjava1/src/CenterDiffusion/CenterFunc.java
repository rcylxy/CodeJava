package CenterDiffusion;

public class CenterFunc {
    public static int max(int a, int b) {
        int i = a > b ? a : b;
        return i;

    }

    public static int Center(char[] charArray, int left, int right) {
        int len = charArray.length;
        int i = left;
        int j = right;
        while (i >= 0 && j < len) {
            if (charArray[i] == charArray[j]) {
                i--;
                j++;
            } else
                break;
        }
        return j - i - 1;
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxlen = 1;
        int begin = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < len - 1; ++i) {
            int oddLen = Center(charArray, i, i);
            int evenLen = Center(charArray, i, i + 1);
            int temp=max(oddLen,evenLen);
            if(temp>maxlen)
            {
                maxlen=temp;
                begin=i-(maxlen-1)/2;
            }
        }
        return s.substring(begin,begin+maxlen);
    }


    public static void main(String[] args) {
        char[] work = "abcddcba".toCharArray();
        System.out.println(Center(work, 2, 3));
    }
}
