class KthLargest {
    int k;
    int[] nums;
    PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        pq = new PriorityQueue<>();
        for(int x : nums) pq.offer(x);
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size() > k) pq.poll();
        return pq.peek();
    }
}
