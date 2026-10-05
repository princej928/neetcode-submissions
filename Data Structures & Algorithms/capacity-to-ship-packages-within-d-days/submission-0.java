class Solution {
    public int days(int[] weights, int a){
        int n = weights.length;
        int sum = 0;
        int day =1;
        for(int i =0;i<n;i++){
            if(sum+weights[i]>a){
                day++;
                sum =0;
            }
            sum = sum+weights[i];
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low =Integer.MIN_VALUE;
        for(int i:weights){
            low = Math.max(i,low);
        }
        int high=0;
        for(int i :weights){
            high+=i;
        }

        while(low<high){
            int mid = low+(high-low)/2;

            int suii = days(weights,mid);

            if(suii<=days){
                high = mid;
            }else{
                low = mid+1;
            }

        }
        return low;

    }
}