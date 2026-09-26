class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        StringBuilder sb = new StringBuilder();

        int i =0;
        int j =0;

        while(i<a && j<b){
            if(i<=j){
                sb.append(word1.charAt(i));
                i++;
            }
            else{
                sb.append(word2.charAt(j));
                j++;
            }
        }

        while(i<a){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<b){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}