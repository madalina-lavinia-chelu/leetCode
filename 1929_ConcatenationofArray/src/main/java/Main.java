import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = IntStream.of(0,2,1,5,3,4).toArray();
        System.out.println(Arrays.toString(solution.getConcatenation(nums)));
    }
}
