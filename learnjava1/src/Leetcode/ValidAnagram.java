package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Classname ValidAnagram
 * @Date 2022/4/15 18:29
 * @Created by 李晓阳
 */
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
public class ValidAnagram {
    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        final int maxNum = 12;
        int[] nums1Work = new int[maxNum];
        int[] nums2Work = new int[maxNum];
        for (int i : nums1) {
            nums1Work[i]++;
        }
        for (int i : nums2) {
            nums2Work[i]++;
        }
        int sum = 0;
        for (int i = 0; i < maxNum; ++i) {
            if (nums1Work[i] != 0 && nums2Work[i] != 0) {
                sum += min(nums1Work[i], nums2Work[i]);
            }
        }
        int[] ret = new int[sum];
        int j = 0;
        for (int i = 0; i < maxNum; ++i) {
            int temp = 0;
            if (nums1Work[i] != 0 && nums2Work[i] != 0) {
                temp = min(nums1Work[i], nums2Work[i]);
                int orl = j;
                for (; j < orl + temp; ++j) {
                    ret[j] = i;
                }
            }

        }
        return ret;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{4, 7, 9, 7, 6, 7};
        int[] nums2 = new int[]{5, 0, 0, 6, 1, 6, 2, 2, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
}
