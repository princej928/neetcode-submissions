class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = nums.length;

        for(int i =0;i<n;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));  

    for(int key :map.keySet()){
        pq.offer(key);
    }

    int a =0;
    int arr[] = new int[k];
    while(!pq.isEmpty()&& a<k){
        arr[a] = pq.poll();
        a++;
    }
    return arr;

    }
}
