import java.util.HashMap;
import java.util.*;

class Solution {
    public String restoreString(String s, int[] indices) {
        Map <Integer,Character> myMap = new HashMap <>();
        StringBuffer rez = new StringBuffer();
        for (int i = 0; i < s.length();i++) {
            myMap.put(indices[i], s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
            rez.append(myMap.get(i));
        }
        return rez.toString();
    }
}