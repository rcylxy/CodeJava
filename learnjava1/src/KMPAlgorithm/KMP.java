package KMPAlgorithm;

public class KMP {
    public int[] getNext(String s) {

        char[] work = s.toCharArray();
        int[] next = new int[work.length];
        //   System.out.println(work);
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


    public static void main(String[] args) {
        String s = "abcabcd";
        KMP out1 = new KMP();
        int[] next = out1.getNext(s);
        for (Integer i : next) {
            System.out.print(i + " ");
        }

    }
}
