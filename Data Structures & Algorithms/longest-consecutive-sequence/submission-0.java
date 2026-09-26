class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int n = nums.length;

        for(int i =0;i<n;i++){
            set.add(nums[i]);
        }
        int max =0;

        for(int i =0;i<n;i++){
            
            if(!set.contains(nums[i]-1)){
                int ans = nums[i];
                int count =1;

             while(set.contains(ans+1)){
                count++;
                ans = ans+1;
             }
             max = Math.max(max,count);
            }
        }
        return max;

    }
}
