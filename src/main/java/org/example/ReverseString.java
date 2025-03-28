package org.example;

public class ReverseString {

    public static void main(String[] args){
        int number =-2147483648;


        System.out.println("The reverse number is "+ reverseNumber(number));
      //rintReversePyramid(10);
    }

    private static void printReversePyramid(int num){
        for(int i = num ; i> 0; i--){
            for(int k =0; k< num-i; k++){
                System.out.print(" ");
            }
            for (int j =1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static int reverseNumber(int x){
        long reverseNumber = 0;
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;
        while(x != 0 ){

            reverseNumber = (reverseNumber*10)+ x%10;
            if(reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE)
                return 0;

            x  = x /10;

        }
        return (int)reverseNumber;

    }
}




