class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        int n = ans.length();

        for(int i =0;i<n;i++){
            for(int j =1;j<strs.length;j++){
                String b = strs[j];

                if(i>=b.length() || ans.charAt(i)!=b.charAt(i)){
                    return ans.substring(0,i-0);
                }
                else{
                    continue;
                }
            }
        }

        return ans;
    }
}