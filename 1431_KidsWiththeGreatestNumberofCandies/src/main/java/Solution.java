import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List <Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> aux = new ArrayList <>();

        int max = Arrays.stream(candies).max().getAsInt();

        Arrays.stream(candies).forEach( i->{
            if(i + extraCandies >= max) {
                aux.add(true);
            } else
                aux.add(false);
        });
        return aux;

    }
}
