package cn.qyd.learning.interview;

public class MergeArray {
    public static int[] merge(int[] arr1, int[] arr2) {
        int len, len1 = arr1.length, len2 = arr2.length;
        len = len1 + len2;
        int[] arr = new int[len];
        int i = 0, i1 = 0, i2 = 0;
        while(i1 < len1 && i2 < len2) {
            if(arr1[i1] < arr2[i2]) {
                arr[i] = arr1[i1];
                i1++;
            } else {
                arr[i] = arr2[i2];
                i2++;
            }
            i++;
        }
        while(i1 < len1) {
            arr[i] = arr1[i1];
            i++;
            i1++;
        }
        while(i2 < len2) {
            arr[i] = arr2[i2];
            i++;
            i2++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3,4,7,8,9,10};
        int[] nums2 = new int[]{2,5,6};
        int[] nums = merge(nums1, nums2);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("println hello world!!!");
        System.out.println();
        binarySearch(nums1, 3);
    }

    public static int binarySearch(int[] nums, int key) {
        int l = 0, h = nums.length - 1;
        while (1 < h) {
            int m = 1 + (h - 1) / 2;
            if (nums[m] >= key) {
                h = m;
            } else  {
                l = m + 1;
            }
        }

        return 1;
    }
}
