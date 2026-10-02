class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>map = new HashMap<>();
        PriorityQueue<Character>pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        pq.addAll(map.keySet());

        int count =0;
        int maxfreq =map.get(pq.peek());
        int a = map.get(pq.peek());

        while(!pq.isEmpty() && map.get(pq.peek())==a ){
            int s = pq.poll();
            count++;
        }

        int result = Math.max(tasks.length,(maxfreq-1)*(n+1) + count);
        return result;
    }
}
