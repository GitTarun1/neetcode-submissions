class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;  
        int i =0;
        List<Character> ls = new ArrayList<>();
        for(int j =0;j<n;j++){
            char ch = s.charAt(j);
            if(!ls.contains(ch)){
                ls.add(ch);
            }
            else{
                while(ls.contains(ch)){
                    ls.remove((Character)s.charAt(i));
                    i++;
                }
                ls.add(ch);
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}
