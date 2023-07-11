import java.util.ArrayList;

class Solution {
    public int maxArea2(int[] height) {
        ArrayList <Integer> areas = new ArrayList<>();

        int max = 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = i + 1 ; j < height.length; j ++){
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }
    public int maxArea(int[] height) {

        int i = 0;
        int max = 0;
        int j = height.length - 1;
        while (i < j){
            final int min = Math.min(height[i], height[j]);
            max = Math.max(max, min * (j - i));
            if(height[i]< height[j])
                i++;
            else
                j --;

        }
        return max;
    }
}