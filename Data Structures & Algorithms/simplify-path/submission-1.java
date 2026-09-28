class Solution {
    public String simplifyPath(String path) {
        String arr[] = path.split("/");

        int n = arr.length;
        Stack<String>st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<n;i++){
            String a = arr[i];

            if(a.equals("")|| a.equals(".")){
                continue;
            }
            else if(a.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(a);
            }
        }
        if(st.isEmpty()){
            sb.append("/");
            return sb.toString();
        }

        for(String s :st){
            sb.append("/");
            sb.append(s);
        }
        return sb.toString();
    }
}