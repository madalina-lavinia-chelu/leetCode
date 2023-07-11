import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int []nums = IntStream.of(1,8,6,2,5,4,8,3,7).toArray();
        System.out.print(solution.maxArea(nums));

    }
}
