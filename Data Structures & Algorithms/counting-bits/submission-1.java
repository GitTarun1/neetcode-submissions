class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i =1;i<n+1;i++){
            if(i %2 !=0) arr[i] = arr[i/2] +1;
            else arr[i] = arr[i/2];
        }
        return arr;
    }
}
