class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        PriorityQueue<Character>pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        pq.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        char prev = '#';

       while(!pq.isEmpty()){
            char ch = pq.poll();

            if(ch==prev){

                if(pq.isEmpty()){
                    return "";
                }
                else {
                    char next = pq.poll();
                    sb.append(next);

                    map.put(next,map.get(next)-1);

                    if(map.get(next)>0){
                        pq.offer(next);
                    }
                    pq.offer(ch);
                    prev = next;
                }
            }
            else{
                sb.append(ch);
                map.put(ch,map.get(ch)-1);

                if(map.get(ch)>0){
                    pq.offer(ch);
                }
                prev = ch;
            }
       }

       return sb.toString();
    }
}