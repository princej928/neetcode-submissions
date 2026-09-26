class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left =0;
        int n = people.length;
        int right =n-1;
        int boats=0;
        Arrays.sort(people);

        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            boats++;
        }

        return boats;
        
    }
}