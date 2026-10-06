class Solution {
    public long minEnd(int n, int x) {
        long bit = 1;
        long ans = x;
        long num = n-1;

        while(num>0){
            if((bit & x) == 0){
                if((num &1)==1){
                    ans = ans|bit;
                }
                num = num>>1;
            }
            bit=bit<<1;
        }
        return ans;
    }
}