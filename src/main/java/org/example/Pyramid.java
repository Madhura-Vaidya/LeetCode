package org.example;

public class Pyramid {

    public static void main(String[] args){
        int num =10;
        for(int i =1; i<= num; i++){
            for(int k =1; k<= num-i; k++){
                System.out.print(" ");
            }
            for(int j =1; j<= 2*i -1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
