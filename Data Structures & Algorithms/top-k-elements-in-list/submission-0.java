class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++) map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry.getKey());
        }
        int[] ans = new int[k];
        while(--k >= 0){
            ans[k] = pq.poll();
        }
        return ans;
    }
}
