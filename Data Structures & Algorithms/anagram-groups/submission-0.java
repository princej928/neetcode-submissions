class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        int n = strs.length;

        for(int i =0;i<n;i++){
            String a = strs[i];
            char arr [] = a.toCharArray();
            Arrays.sort(arr);
            String ans = new String(arr);

            if(!map.containsKey(ans)){
                map.put(ans,new ArrayList<>());
            }
            map.get(ans).add(a);
        }

        ArrayList<List<String>> b = new ArrayList<>();

        for(List<String>a :map.values()){
            b.add(a);
        }
        return b;
        
    }
}
