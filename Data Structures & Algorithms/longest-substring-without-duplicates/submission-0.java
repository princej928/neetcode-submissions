class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        int n = s.length();
        int left=0;
        HashSet<Character>set = new HashSet<>();

        for(int i =0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
           set.add(s.charAt(i));
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
