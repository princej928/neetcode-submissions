class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n =nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>list = new ArrayList<>();

        for(int i =0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int ans = (int) Math.ceil(n/3);

        for(int i =0;i<n;i++){
            if(map.get(nums[i])>ans){
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }
            }
        }

        return list;
    }
}