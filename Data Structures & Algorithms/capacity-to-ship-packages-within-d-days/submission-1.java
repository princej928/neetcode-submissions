class Solution {
    public int suii(int weights[],int mid){
        int n = weights.length;
        int day=0;
        int sum =0;
        for(int i=0;i<n;i++){
            if(sum+weights[i]>mid){
                day++;
                sum =0;
                sum = sum+weights[i];
            }else{
                sum = sum+weights[i];
            }
        }
        return day+1;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low =Integer.MIN_VALUE;
        int high =0;
        for(int x:weights){
            low = Math.max(low,x);
            high+=x;
        }

        while(low<=high){
            int mid = low+(high-low)/2;

            int a = suii(weights,mid);

            if(a<=days){
               high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}