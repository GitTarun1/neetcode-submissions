class Solution {
    void helper(int i,int n,int target,int[] nums,List<Integer> ls,List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(ls));
            return;
        }
        if(i >= n) return;
        ls.add(nums[i]);
        if(target >= nums[i])helper(i,n,target-nums[i],nums,ls,list);
        ls.remove(ls.size()-1);
        helper(i+1,n,target,nums,ls,list);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        helper(0,n,target,nums,new ArrayList<>(),list);
        return list;
    }
}
