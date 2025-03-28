package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //int [] nums = {3, 1, 2, 10, 1};
       // runningSum(nums);

       // int[][] accounts =  {{7,1,3}, {2,8,7},{1,9,5}};
       // int wealth = richestWealthCust(accounts);
       // System.out.println("The maximun wealth for the customer is:" + wealth);
        //int count = reduceToZero(4);
       // System.out.println(count);
       // System.out.println("If ransomeNote from magazine"+ isRansomeNote("abc","aabc"));
        System.out.println(longestSubstring("pwpwefpw"));
    }
    public static void runningSum(int[] nums){
        int len = nums.length;

        for(int  i =1; i<len; i++){
            nums[i] = nums[i-1] + nums[i];
            System.out.println(nums[i]);
        }
    }

    public static int richestWealthCust(int [][] customers){
        int maxWealthSoFar = 0;

        for(int[] customer : customers){
            int customerWealth = 0;
             for(int bank : customer){

                 customerWealth = customerWealth + bank;
             }
            maxWealthSoFar = Math.max(customerWealth, maxWealthSoFar);

         }
         return maxWealthSoFar;
    }

    public static int reduceToZero(int number){
        int count = 0;
        while (number != 0){

            if(number %2 == 0){
                number = number/2;
            }
            else {
                number = number -1;
            }
            count ++;
        }

        return count;
    }

    public static boolean isRansomeNote(String ransomeNote, String magazine){
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            Character m = magazine.charAt(i);
            int occurance = characterMap.getOrDefault(m, 0);
            characterMap.put(m, occurance+1);

        }
        for(int j =0 ; j< ransomeNote.length(); j++){
            Character r = ransomeNote.charAt(j);
            if(characterMap.get(r) == null)
                return false;
            else{
                int found = characterMap.get(r);
                characterMap.put(r, found-1);
            }
        }

        return true;
    }
    public static int longestSubstring(String givenString){
        HashSet<Character> set = new HashSet<>();
        int  end = 0;
        int maxLen = 0;
        for (int start = 0; start < givenString.length(); start++){
            if(!set.contains(givenString.charAt(start))){
                set.add(givenString.charAt(start));
                maxLen = Math.max(maxLen, set.size());

            }
            else {
                while(set.size() !=0){
                    set.remove(givenString.charAt(end));
                    end++;
                }
                set.add(givenString.charAt(start));

            }



        }
        return maxLen;
    }

    private static void isStringValid(String string){

    }

}