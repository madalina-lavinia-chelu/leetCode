import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int removeDuplicates2(int[] nums) {

        /*
        Memory
            44.75MB
            Beats43.90%
        Runtime
            5ms
            Beats 7.62%
         */
        int n = nums.length;

        for(int i = n - 2; i >= 0; i--)
            if(nums[i] == nums[i + 1]){
                for(int j = i ; j < n - 1; j ++){
                    nums[j] = nums[j + 1];
                }
                n--;
            }
        /*Arrays.stream(nums)
                .limit(n)
                .forEach(e -> System.out.println(e));*/
        return n;

    }
    public int removeDuplicates1(int[] nums){
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet())
                .size();


        /* mySet.stream()
                .forEach(System.out::println);*/
    }
    public int removeDuplicates(int[] nums){
        return (int) Arrays.stream(nums)
                .distinct()
                .count();
    }

}