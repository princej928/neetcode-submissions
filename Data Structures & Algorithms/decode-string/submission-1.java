class Solution {
    public String decodeString(String s) {
        Stack<Integer>num = new Stack<>();
        Stack<String>a = new Stack<>();

        String curr = "";
        int k =0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                k = k*10 + (ch-'0');
            }

            else if(ch=='['){
                num.push(k);
                a.push(curr);

                k=0;
                curr="";
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