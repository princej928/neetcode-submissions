class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int n = arr.length;
        int maxsum =arr[0];
        int minsum =arr[0];
        int sum=0;
        int sub=0; 
        int total =0;


    for(int i=0;i<n;i++){
        sum = Math.max(sum+arr[i],arr[i]);
        maxsum = Math.max(maxsum,sum);

        sub = Math.min(sub+arr[i],arr[i]);
        minsum = Math.min(minsum,sub);
        total+=arr[i];

    }
    if(maxsum<0) return maxsum;
   return Math.max(maxsum,total-minsum);
        

        
    }
}