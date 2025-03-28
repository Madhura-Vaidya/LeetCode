package org.example;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int [] nums = {1,2,2};
        int begin = 0;
        int end = 1;
        int count = 1;
        while(end < nums.length){
            if(nums[begin] == nums[end]){
                end++;

            }
            else{
                nums[begin+1] = nums[end];
                //array[end] = 0;
                begin++;
                end++;
                count++;
            }
        }
        System.out.println(Arrays.toString(nums) + count);

    }

}
