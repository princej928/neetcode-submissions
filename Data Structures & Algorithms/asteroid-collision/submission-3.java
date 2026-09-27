class Solution {
    public int[] asteroidCollision(int[] arr) {
        ArrayList<Integer>list = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        int n = arr.length;

        for(int i =0;i<n;i++){
            while(!st.isEmpty() && st.peek()>0 &&arr[i]<0){
               if(Math.abs(st.peek())<Math.abs(arr[i])){
                        st.pop();
                }
                    else if(Math.abs(st.peek())==Math.abs(arr[i])){
                        st.pop();
                        arr[i]=0;
                        break;
                    }
                    else{
                        arr[i]=0;
                        break;
                    }
                }

           if(arr[i]!=0){
            st.push(arr[i]);
           }

        }

     while(!st.isEmpty()){
        int a = st.pop();
        list.add(a);
     }
     Collections.reverse(list);

     int ans[] = new int[list.size()];

     for(int i=0;i<list.size();i++){
        ans[i] = list.get(i);
     }
     return ans;
    }
}
