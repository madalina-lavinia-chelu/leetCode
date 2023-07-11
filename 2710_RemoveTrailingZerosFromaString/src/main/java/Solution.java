class Solution {
    public String removeTrailingZeros(String num) {

        StringBuffer st = new StringBuffer(num);
        int k = st.length() - 1;

        while(st.charAt(k) == '0') {
            k--;
        }

        System.out.println(k);
        k++;
        return st.substring(0,k);

    }
}