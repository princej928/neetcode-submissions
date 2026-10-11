class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st = new Stack<>();
        int add =0;
        for(String a : operations){
            if(a.equals("+")){
                if(st.size()>=2){
                    int b = st.pop();
                    int sum = b+st.peek();
                    st.push(b);
                    st.push(sum);
                }
            }
           else if(a.equals("D")){

                int s = st.peek()*2;
                st.push(s);
            }
           else if(a.equals("C")){
                st.pop();
            }
            
        else{
        int x = Integer.parseInt(a);
        st.push(x);
        }
            
        }

        for(int score:st){
            add+=score;
        }
        return add;
    }
}