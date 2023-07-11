public class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] rez = new int[nums.length * 2];
        int z = 0, f = nums.length;
        for(int i = 0; i < nums.length; i ++){
            rez[z++] = nums[i];
            rez [f++] = nums[i];
        }
        return rez;

    }
}
