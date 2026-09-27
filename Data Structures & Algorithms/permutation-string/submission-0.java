class Solution {
    public boolean anagrams(String a, String b){
        HashMap<Character,Integer>map =new HashMap<>();

        for(int i =0;i<a.length();i++){
            char ch = a.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i =0;i<b.length();i++){
            char ch = b.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }

        for(int x:map.values()){
            if(x!=0){
                return false;
            }
        }
        return true;

    }
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int left =0;

        for(int i=0;i<m;i++){

        while((i-left+1)>n){
            left++;
        }
        String a = s2.substring(left,i+1);
        if(s1.length()==a.length()){

        if(anagrams(s1,a)){
            return true;
        }
    }

    }
    return false;
        
    }
}
