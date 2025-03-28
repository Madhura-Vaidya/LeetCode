package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class SubstringWoRepeat {

    public static void main(String args[]){
        String str = "bb";
        int len = substringWithoutRepetition(str);
        System.out.println(len);
    }

    private static int substringWithoutRepetition(String s){
        char[] arr = s.toCharArray();
        int len  = arr.length;
        // base case
        if(len <2){
            return len;
        }
        //initialize pointers

        int left = 0, right = 0;

        //initialize maxLen
        int maxLen = Integer.MIN_VALUE;

        //initialize set
        HashMap<Character, Integer> map = new HashMap<>();

        //logic

        while(right < len){
            int occurance = map.getOrDefault(arr[right],0);
            //if the character is in the map then remove the left character from array
            if(occurance > 0){
                map.remove(arr[left]);
                left++;

            }
            else {
                map.put(arr[right], occurance + 1);
                maxLen = Math.max(maxLen, right - left + 1);

                right++;
            }




        }
        return maxLen;

    }
}
