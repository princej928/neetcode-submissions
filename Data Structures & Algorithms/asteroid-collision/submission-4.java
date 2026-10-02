class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer>st = new Stack<>();
      int n = arr.length;
      int b =1;

        for(int i=0;i<n;i++){

            while(!st.isEmpty() && arr[i]<0 && st.peek()>0){
                if(Math.abs(arr[i])>st.peek()){
                    st.pop();
                    
                }
                else if(Math.abs(arr[i])==st.peek()){
                        st.pop();
                        b=0;
                        break;
                }
                else{
                    b=0;
                    break;
                }
               
            }
           if(b==1){
            st.push(arr[i]);
            b=1;
           }else{
            b=1;
            continue;

           }
        }
         int ans[] = new int[st.size()];
         int a =0;
        for(int i :st){
            ans[a] = i;
            a++;
        }
        return ans;
    }
}