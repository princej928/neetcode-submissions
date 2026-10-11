class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));

        

        for(int i :nums){
           map.put(i,map.getOrDefault(i,0)+1);
           
        }

        for(int key :map.keySet()){
            pq.add(key);
        }

        return pq.peek();
    }
}
