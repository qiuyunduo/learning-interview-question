package cn.qyd.learning.interview;

public class OddOrEvenSort {
    public static void sortOddAndEven(int[] arr) {
        int left = 0, right = arr.length - 1;
        int temp;
        while(left < right) {
            if((arr[right] & 1) == 0 && left < right) {
                right--;
            }
            if((arr[left] & 1) == 1 && left < right) {
                left++;
            }

            if(left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        sortOddAndEven(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("Hello world!!!");
        System.out.println();
    }

    public static  void main(String[]) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println("The is a program");
    }
}
