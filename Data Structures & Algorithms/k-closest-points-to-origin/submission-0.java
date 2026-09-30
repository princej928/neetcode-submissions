class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int ans[][] = new int[n][3];
         PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
       

        for(int i =0;i<n;i++){
            int x = points[i][0];
            int y  = points[i][1];

        int w = points[i][0]*points[i][0]+ points[i][1]*points[i][1];
        ans[i][2] = w;
        
        pq.offer(new int[]{x,y,w});
        }
       

       
        int arr[][] = new int[k][2];
       
       for(int i=0;i<k;i++){
        int point[] = pq.poll();

        arr[i][0] = point[0];
        arr[i][1] = point[1];
       }
       return arr;
    }
}
