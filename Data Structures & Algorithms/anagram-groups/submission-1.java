class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        int n = strs.length;
        for(int i = 0; i < n; i++){
            char[] freq = new char[26];
            for(char ch : strs[i].toCharArray()){
                freq[ch-'a']++;
            }
            String key = Arrays.toString(freq);
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(strs[i]);
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            ans.add(new ArrayList<>(entry.getValue()));
        }
        return ans;
    }
}
