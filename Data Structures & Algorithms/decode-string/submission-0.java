class Solution {
    public String decodeString(String s) {
        Stack<Integer>num = new Stack<>();
        Stack<String>a = new Stack<>();
        int n = s.length();

        String curr= "";
        int  k =0;

        for(int i =0;i<n;i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                k = k*10 +(ch-'0');
            }
            else if(ch=='['){
                num.push(k);
                a.push(curr);

                curr="";
                k=0;
            }
            else if(ch==']'){
                int count = num.pop();
                StringBuilder sb = new StringBuilder();

                for(int j =0;j<count;j++){
                    sb.append(curr);

                }
                curr = a.pop()+sb.toString();
            }
            else{
                curr+=ch;
            }
        }

        return curr;

    }
}