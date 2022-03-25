package ManacherA;

public class Func {
    public String addIt(String s) {
        char[] work = s.toCharArray();
        StringBuilder work1 = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            work1.append('#');
            work1.append(work[i]);
        }
        work1.append('#');
        return work1.toString();
    }

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1)
            return s;
        String work = addIt(s);
        int sLen = 2 * len + 1;
        int[] p = new int[sLen];    //p[i]数组是中心扩散的最大的长度,回文半径

        int maxRight = 0;   //maxRight是目前已经被探测到的最长的回文子串的右侧边界
        int center = 0;     //center就是对应于maxRight最长的子串的中心点
        int maxLen = 1;     //最长的长度初始化为1
        int begin = 0;      //回文子串开始的位置

        char[] charArray = work.toCharArray();  //工作字符数组
        for (int i = 0; i < sLen; ++i) {
            if (i < maxRight) {
                int mirror = 2 * center - i;
                p[i] = Math.min(p[mirror], maxRight - i);
            }
            int left = i - (1 + p[i]);      //找到i位置的左侧边界
            int right = i + (1 + p[i]);     //找到i位置的右侧边界
            //继续进行中心扩散
            while (left >= 0 && right < sLen && charArray[left] == charArray[right]) {
                p[i]++;
                left--;
                right++;
            }
            //更新maxRight的值
            if (i + p[i] > maxRight) {
                maxRight = i + p[i];
                center = i;
            }
            if (p[i] > maxLen) {
                maxLen = p[i];
                begin = (i - maxLen) / 2;   //在这里一下请想一下加入的#对于下标的影响
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public static void main(String[] args) {
        String s = "abcd";
        Func a = new Func();
        System.out.println(a.addIt(s));

    }
}















