class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);

        for(int i:nums){
            pq.offer(i);
        }
        int ans =0;
        int count =0;
        while(!pq.isEmpty()){
            count++;
            if(count==k){
                ans = pq.poll();
            }
            else{
                pq.poll();
            }
        }
        return ans;
    }
}
