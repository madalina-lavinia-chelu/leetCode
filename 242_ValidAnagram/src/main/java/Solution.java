class Solution {


    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int []fr_S = new int[26];
        int []fr_T = new int[26];

        for(int i = 0; i < s.length(); i++){
            fr_S[s.charAt(i) - 'a']++;
            fr_T[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26;i ++){
            if(fr_S[i] != fr_T[i])
                return false;
        }
        return true;

    }

    public String sortare(String s){
        char[]s_bf = s.toCharArray();
        for(int i = 0; i < s_bf.length - 1; i++){
            for(int j = i+1; j < s_bf.length; j++) {
                char temp;
                if (s_bf[j] < s_bf[i]) {
                    temp = s_bf[i];
                    s_bf[i] = s_bf[j];
                    s_bf[j] = temp;
                }
            }
        }
        return String.valueOf(s_bf);


    }
    public boolean isAnagram1(String s, String t) {
        s = sortare(s);
        t = sortare(t);

        if(s.equals(t))
            return true;
        else
            return false;

    }
    public boolean isAnagram2(String s, String t) {
        StringBuffer s_bf = new StringBuffer(s);
        StringBuffer t_bf = new StringBuffer(t);
        int k = 0;
        for(int i = 0; i < s_bf.length();i++){
            int ok = 0;
            for(int j = 0; j < t_bf.length();j++) {
                if (s_bf.charAt(i) == t_bf.charAt(j))
                    ok = 1;
            }
            if(ok == 1)
                k++;

        }
        if(k == s.length() && s.length() ==t.length())
            return true;
        else
            return false;

    }
}