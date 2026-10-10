class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i:nums2){
            list.add(i);
        }

        Collections.sort(list);
        double ans =0;
        int n = list.size()/2;
        if(list.size()%2!=0){
            ans = (double) list.get(n);
        }
        else{
         double value = (double)list.get(n) + (double)list.get(n-1);
         ans  = (double)value/2;
        }
        return ans;
    }
}
