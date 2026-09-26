class Solution {
    public boolean hasDuplicate(int[] arr) {
        HashSet<Integer>set = new HashSet<>();
        int n = arr.length;

        for(int i =0;i<n;i++){
            set.add(arr[i]);
        }

        if(set.size()!=n){
            return true;
        }
           
       return false;

        
}
}