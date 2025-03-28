package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){
        int[] array = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(array, target)));

    }

    private static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        int len  = nums.length;

        //base case
        if(len == 0)
            return result;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <len; i++){
            if(map.get(target - nums[i] )== null){
                map.put(nums[i], i);
            }
            else{
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            }

        }



        return result;
    }
}
