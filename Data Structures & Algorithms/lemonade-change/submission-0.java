class Solution {
    public boolean lemonadeChange(int[] bills) {
        int countfive =0;
        int countten =0;
        int n = bills.length;

        for(int i=0;i<n;i++){
            if(bills[i]==5){
                countfive++;
            }
            else if(bills[i]==10){
                if(countfive==0){
                    return false;
                }
                else{
                    countfive--;
                    countten++;
                }
            }
            else{
                if(countfive>=1 && countten>=1){
                    countten--;
                    countfive--;
                }
                else if(countfive>=3){
                    countfive = countfive-3;
                }
                else{
                    return false;
                }
            }


        }
        return true;
    }
}