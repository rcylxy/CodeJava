package Leetcode;

import java.util.Arrays;

/**
 * @Classname ATest
 * @Date 2022/4/19 0:13
 * @Created by 李晓阳
 */
public class ATest {

    public int peakIndexInMountainArray(int[] arr) {
        int[] h = (int[]) arr.clone();
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        for (int i = 0; i < h.length; ++i) {
            if (max == h[i])
                return i;
        }
        return -1;
    }
}

