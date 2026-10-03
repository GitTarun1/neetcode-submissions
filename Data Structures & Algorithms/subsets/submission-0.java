class Solution {
    public void helper(int i,int[] nums,List<List<Integer>> list,List<Integer> ls){
        if(i >= nums.length){
            list.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[i]);
        helper(i+1,nums,list,ls);
        ls.remove(ls.size()-1);
        helper(i+1,nums,list,ls);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(0,nums,list,new ArrayList<>());
        return list;
    }
}
