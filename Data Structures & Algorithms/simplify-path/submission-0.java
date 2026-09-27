class Solution {
    public String simplifyPath(String path) {
        Stack<String>st = new Stack<>();
        String[]arr = path.split("/");

        for(String s:arr){
            if(s.equals("")||s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(s);
            }
        }
        StringBuilder sb  = new StringBuilder();

        if(st.isEmpty()){
            sb.append("/");
            return sb.toString();
        }
       
        for(String s : st){
            sb.append("/");
            sb.append(s);
            
        }

        

      
        return sb.toString();


        
    }
}