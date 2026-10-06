class Solution {
    public int reverse(int x) {
        int ans = 1;
        double min = Math.pow(-2,31);
        double max = Math.pow(2,31);
        if(x<0){
            ans =-1;
        }
        int temp= Math.abs(x);
        long sum =0;
        while(temp>0){
            int a = temp%10;
            sum = sum*10 +a;
            if(sum<=min || sum>=max){
                return 0;
            }
            temp = temp/10;
        }

        return ans*(int)sum;
    }
}
