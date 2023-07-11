import java.util.ArrayList;
import java.util.List;

class Solution {
    public List <Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, z = 0;
        List<Integer> rez = new ArrayList <>();

        while (i < arr1.length && j <  arr2.length && z < arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[z]) {
                rez.add(arr1[i]);
                i++;
                j++;
                z++;
            }
            else if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else if(arr2[j]<arr3[z])
                j++;
            else if(arr2[j]>arr3[z])
                z++;
        }
        return rez;
    }
}