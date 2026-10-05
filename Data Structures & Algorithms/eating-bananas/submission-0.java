class Solution {
    public static int time(int []piles, int a){
        int hour =0;
        int n = piles.length;
        for(int i =0;i<n;i++){
            hour += (int)Math.ceil((double)piles[i]/a);
        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low =1;
        int high = 0;
        for(int i:piles){
           high = Math.max(i , high);
        }

        while(low<high){
            int mid = low +(high-low)/2;

            int ans = time(piles,mid);

            if(ans<=h){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
