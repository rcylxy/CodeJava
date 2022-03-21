package KMPAlgorithm;

public class KMPDemo {
    public int[] getNext(String s) {
        char[] work = s.toCharArray();
        int[] next = new int[work.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < work.length - 1) {
            if (k == -1 || work[j] == work[k]) {
                if (work[++j] == work[++k]) {
                    next[j] = next[k];
                } else
                    next[j] = k;
            } else if (work[k] != work[j]) {
                k = next[k];
            }
        }
        return next;
    }

    public int KMP(String ts, String ps) {
        char[] t = ts.toCharArray();
        char[] p = ps.toCharArray();
        int i = 0; // 主串的位置
        int j = 0; // 模式串的位置
        int[] next = getNext(ps);
        while (i < t.length && j < p.length) {
            if (j == -1 || t[i] == p[j]) { // 当j为-1时，要移动的是i，当然j也要归0
                i++;
                j++;
            } else {
                j = next[j]; // j回到指定位置
            }
        }
        if (j == p.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String s = "abcabcd";
        String ps = "cd";
        KMPDemo out1 = new KMPDemo();
        int[] next = out1.getNext(s);
//        for (Integer i : next) {
//            System.out.print(i + " ");
//        }
        System.out.println(out1.KMP(s, ps));

    }
}
