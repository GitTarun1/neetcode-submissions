class Solution {
    public boolean checkInclusion(String s1, String s2) {
    
        int m = s1.length();
        int n = s2.length();
        if(n < m) return false;
        char[] freq = new char[26];
        for(char ch : s1.toCharArray()){
            freq[ch-'a']++;
        }

        for(int i =0; i<n; i++){
            char ch = s2.charAt(i);
            if(s1.indexOf(ch) != -1){
                char[] freq2 = new char[26];
                int p = i;
                for(int j =0;j<m;j++){
                    freq2[s2.charAt(p) - 'a']++;
                    p++;
                    if(p >= n) break;
                }
                if(Arrays.toString(freq).equals(Arrays.toString(freq2))) return true;
            }
        }
        return false;
    }
}
