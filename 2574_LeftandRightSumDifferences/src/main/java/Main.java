import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int []nums = IntStream.of(10,4,8,3).toArray();
        System.out.println(Arrays.toString(solution.leftRightDifference(nums)));
    }
}
