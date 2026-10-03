class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int ans[][] = new int[n][3];
        for(int i =0;i<n;i++){
            ans[i][0] = tasks[i][0];
            ans[i][1] = tasks[i][1];
            ans[i][2] = i;
        }

        Arrays.sort(ans,(a,b)->a[0]-b[0]);

        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }
            return a[2]-b[2];
        });

        int result[] = new int[n];
        int time = 0;
        int i =0;
        int k =0;
        while(k<n){
            if(pq.isEmpty()){
                time = Math.max(time,ans[i][0]);
            }

            while(i<n && ans[i][0]<=time){
                pq.offer(ans[i]);
                i++;
            }
            int task[] = pq.poll();
            result[k++] = task[2];
            time += task[1];

        }
        return result;

    }
}