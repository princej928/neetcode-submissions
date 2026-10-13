
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int count = 1;
        int max = 1;

        for(int i=0;i<n-1;i++){
            if(i%2==0 && arr[i]<arr[i+1] || i%2!=0 && arr[i]>arr[i+1]){
                count++;
            }else{
                count=1;
            }
            max = Math.max(max,count);
        }
        count =1;
        for(int i=0;i<n-1;i++){
            if(i%2==0 && arr[i]>arr[i+1] || i%2!=0 && arr[i]<arr[i+1]){
                count++;
            }else{
                count=1;
            }
            max = Math.max(max,count);
        }

        return max;
    }
}
