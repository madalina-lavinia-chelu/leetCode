class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []rez = new int[nums.length];
        int z = 0;
        for(int i = 0; i < nums.length/2; i += 1){
            rez[z++] = nums[i];
            rez[z++] = nums[n+i];
        }
        return rez;

    }
}