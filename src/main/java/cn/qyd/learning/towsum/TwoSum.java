package cn.qyd.learning.towsum;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        int target = 10;
        int[] twoSumIndex = getTwoSumIndex(nums, target);
        for (int i = 0; i < twoSumIndex.length; i++) {
            System.out.println(twoSumIndex[i]);
        }
    }

    public static int[] getTwoSumIndex(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{0,0};
        }

        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(resultMap.containsKey(nums[i])) {
                //　一旦此时数字ａ存在于Map的键中，则说明有数字a和该数字相加等于目标数字，通过Map找出数字对应的数组下标，完成查找
                resultMap.forEach((k, v) -> {
                    System.out.println(k + " : " + v);
                });
                return new int[]{resultMap.get(nums[i]), i};
            } else {
                // 将与此时数字a相加等于目标数字的数字b以{b : a.index}形式存入Map
                resultMap.put(target - nums[i], i);
            }
        }

        return new int[]{0,0};
    }
}
