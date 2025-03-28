package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayAlgorithm {
    public static void main(String[] args){
       int[] array = { 1,2,3,4,5,6};
        /*System.out.println(binarySearch(array,3));
        System.out.println(binarySearch(array,1));
       System.out.println(binarySearch(array,6));
        System.out.println(binarySearch(array,8));*/
        int[] array2 = { -1,2,9,7,-4,0};
       // Arrays.stream(findEvenNum2(array,array2)).forEach(System.out::print);
       // Arrays.stream(reverseArray(array)).forEach(System.out::print);
        rotateArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public static boolean binarySearch(int[] array, int item){
        int left = 0;
        int right = array.length -1;
        while(left <= right){
            int mid = left+ right/2;
            if(array[mid] == item){
                return true;
            }
            else if(array[mid] < item){
                left = mid +1;
            }
            else{
                right = mid -1;
            }

        }
        return false;
    }

    public static int[] findEvenNum2(int[] arr1, int[] arr2){
        return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream).distinct()
                .filter(x -> x%2 == 0).toArray();
    }

    public static int[] reverseArray(int[] array){
       if(array == null || array.length == 0)
           return new int[0];
        for(int i = 0; i< array.length/2; i++){
            int temp = array[i];//0 1 2
            array[i] = array[array.length -1 -i];//13 2 1
            array[array.length -1 -i] = temp;//0 1 2
        }
        return array;
    }

    public static void rotateArray(int[] numbers){
        int temp = numbers[0];
        for(int i=0; i<numbers.length-1; i++){
            numbers[i] = numbers[i+1];
        }
        numbers[numbers.length-1] = temp;
    }
}
