package Leetcode;

/**
 * @Classname BinarySearchClass
 * @Date 2022/4/16 20:48
 * @Created by 李晓阳
 */
//给定一个n个元素有序的（升序）整型数组nums 和一个目标值target写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1
public class BinarySearchClass {
    public static int search(int[] nums, int target) {
        if(nums[0]==target)
            return 0;
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right) {
            mid = (left + right) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,5};
        System.out.println(search(nums, 5));

    }
}
