import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] leftRightDifference(int[] nums) {
        ArrayList<Integer> rez = new ArrayList<>();

        int sumLeftVar = 0;
        int sumRightVar = Arrays.stream(nums).sum();


        for(int i = 0; i < nums.length ;i++)
        {
            sumRightVar -= nums[i];
            rez.add(Math.abs(sumLeftVar- sumRightVar));
            sumLeftVar += nums[i];
        }
        return rez.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}