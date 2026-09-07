class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for(int x : nums){
            if(list.contains(x)) return true;
            list.add(x);
        }
        return false;
    }
}