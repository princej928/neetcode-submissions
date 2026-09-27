class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer>list = new ArrayList<>();
        int n = arr.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
    int diff = Integer.compare(Math.abs(a - x), Math.abs(b - x));

    if (diff == 0) {
        return Integer.compare(a, b);
    }
    return diff;
});


        
        for(int a:arr){
            pq.offer(a);
        }

        while(list.size()<k && !pq.isEmpty()){
            int a =pq.poll();
            list.add(a);
        }
        Collections.sort(list);
        return list;
        
    }
}