package Leetcode;

import java.util.Arrays;

public class gs {
    //g--children  s--food
    public int findContentChildren(int[] g, int[] s) {
        int ret = 0;
        int i;
        Arrays.sort(s);
        Arrays.sort(g);
        int index = s.length - 1;
        for (i = g.length - 1; i >= 0; --i) {
            if (index >= 0 && s[index] >= g[i]) {
                index--;
                ret++;
            }
        }
        return ret;
    }


    public static void main(String[] args) {
        int[] g = new int[]{10, 9, 8, 7};
        int[] s = new int[]{10, 9, 8, 7};
        gs test1 = new gs();
        int m = test1.findContentChildren(g, s);
        System.out.println(m);

    }
}
