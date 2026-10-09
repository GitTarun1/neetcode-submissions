class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> (a[0] * a[0] + a[1] * a[1])
            - (b[0] * b[0] + b[1] * b[1])
);
        int[][] ans = new int[k][2];
        for(int[] arr : points) pq.offer(arr);
        int i =0;
        while(i < k){
            ans[i++] = pq.poll();
        }
        return ans;
    }
}
