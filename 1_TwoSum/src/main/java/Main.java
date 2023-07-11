import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int [] nums = IntStream.of(2,7,11,15).toArray();
        int [] rez = new int[2];
        int target = 9, z = 0;

        for(int i = 0; i < nums.length - 1; i ++){
            for(int j = i + 1; j < nums.length; j ++)
                if(nums[i] + nums[j] == target)
                {
                    rez[z++] = i;
                    rez[z++] = j;
                }
        }

        for(int i = 0; i < rez.length; i++){
            System.out.println(rez[i] + " ");
        }
    }
}
