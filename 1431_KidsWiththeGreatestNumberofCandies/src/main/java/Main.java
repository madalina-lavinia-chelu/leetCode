import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int []arr = IntStream.of(2,3,5,1,3).toArray();
        System.out.println(Arrays.toString(solution.kidsWithCandies(arr, 3).toArray()));
    }
}
