import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String sortSentence(String s) {
        StringBuilder rez = new StringBuilder();
        Map <Integer, String> mapString = new HashMap <>();
        String [] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            mapString.put((int)(( arr[i].charAt(arr[i].length() - 1) - '0') -1), arr[i].substring(0, arr[i].length() - 1));
        }
        for(int i = 0; i < arr.length; i++){
            rez.append(mapString.get(i)).append(" ");
        }
        return rez.toString().substring(0,rez.length() - 1);
    }

    public String sortSentence1(String s) {

        String ans = "";
        HashMap<Integer, String> map = new HashMap<>();

        Arrays.stream(s.split(" ")).
                forEach(s1 -> map.put(Integer.valueOf(s1.substring(s1.length()-1)),
                        s1.substring(0, s1.length()-1)));

        for (int i = 1; i <= map.size(); i++) {
            if (i == map.size()) ans += map.get(i);
            else ans += map.get(i) + " ";
        }

        return ans;

    }
}