class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        int n =  strs.size();

        for(int i =0;i<n;i++){
            sb.append(strs.get(i));
            sb.append("suii@4");
        }

        String str = sb.toString();
        return str;

    }

    public List<String> decode(String str) {
            ArrayList<String>list = new ArrayList<>();
             String arr[]= str.split("suii@4",-1);
             int n =arr.length;

             for(int i =0;i<n-1;i++){
                list.add(arr[i]);
             }
             
        return list;

    }
}
