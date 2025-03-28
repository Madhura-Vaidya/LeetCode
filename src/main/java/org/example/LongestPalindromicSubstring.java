package org.example;

public class LongestPalindromicSubstring {

    public static void main (String[] args){
        String str = "acbbcd";
        System.out.println(longestPalindromeString(str));



    }

    public static String longestPalindromeString(String str){
        int right ;
        int currentIndex = str.length()/2;
        //if the string has even number of characters then middle is between 2 characters
        if(str.length() % 2 == 0){
            right = currentIndex;
        }
        //if the string has odd number of characters then middle move the pointer to +1 and -1
        else {
            right = currentIndex + 1;
        }
        int left = currentIndex - 1;

        String longestSubString = null;
        while (right < str.length() && left >= 0 ){

            if(str.charAt(left) == str.charAt(right)){
                longestSubString = str.substring(left, right+1);
                left --;
                right ++;
            }
            else
                return longestSubString;

        }
        return longestSubString;

    }
}
