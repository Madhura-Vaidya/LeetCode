package org.example;

import java.util.HashMap;

public class ThreeSum {

    public static void main(String[] args){

    }
    private int[][] threesum(int[] nums){
        int[][] result = new int[3][3];
        if(nums == null){
            return result;
        }
        HashMap<Integer, Integer> secondElement = new HashMap<>();
        HashMap<Integer, Integer> thirdElement = new HashMap<>();
        //-1,0,1,2,-1,-4
        for(int i = 0; i< nums.length; i++){
            if(secondElement.get(0 - nums[i]) == null){
                secondElement.put(nums[i], i);
            }
        }
        return result;
    }
}
