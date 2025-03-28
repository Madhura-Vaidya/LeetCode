package org.example;

public class ContainerWithMostWater {
    public static void main(String[] args){
        ContainerWithMostWater c = new ContainerWithMostWater();
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(c.findMaxArea(heights));

    }
    private int findMaxArea(int[] heights){
        int maxArea = 0;
        int height = 0;
        int left = 0;
        int right = heights.length -1;
        while(left < right) {
            height = Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, (right - left) * height);
            if(heights[left] < heights[right]){
                left++;
            }else if(heights[right] > heights[left]){
                right--;
            }
            else {
                left++;
                right--;
            }

        }

        return maxArea;
    }
}
