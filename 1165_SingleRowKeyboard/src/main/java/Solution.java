import java.util.HashMap;
import java.util.Map;

class Solution {
    public int calculateTime(String keyboard, String word) {
        Map <Character, Integer> keyMap = new HashMap <>();
        int k = 0;
        for(int i = 0; i < keyboard.length(); i++)
            keyMap.put(keyboard.charAt(i), i);

        char []arrWord = word.toCharArray();
        int cuurentIndex = 0;
        for(int i = 0; i < arrWord.length; i++){
            int index = keyMap.get(arrWord[i]);
            if(i == 0){
                k += index;
                cuurentIndex = index;
            }
            else {
                k += Math.abs(index - cuurentIndex);
                cuurentIndex = index;
            }

        }
        return k;

    }
}