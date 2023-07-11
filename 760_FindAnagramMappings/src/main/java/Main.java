import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int []arr1 = {12,28,46,32,50};
        int []arr2 = {50,12,32,46,28};
        System.out.println(Arrays.toString(solution.anagramMappings(arr1,arr2)));

    }
}
