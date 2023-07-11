class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0, k = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum != target  )
            {
                sum += nums[i];
                k++;
            }
        }
        if(sum == target && target == 3)
            return k;
        else
            return 0;
    }
}