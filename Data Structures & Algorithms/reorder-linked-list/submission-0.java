/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
       ArrayList<Integer>list = new ArrayList<>();

       ListNode temp = head;
       while(temp!=null){
        list.add(temp.val);
        temp = temp.next;
       }
       int arr[] = new int[list.size()];
        int k=0;
       for(int i :list){
        arr[k++]= i;
       }

       int ans[] = new int[list.size()];
       int j = list.size()-1;
       int i=0;
        int w =0;
       while(i<=j){
        if(w%2==0){
            ans[w] = arr[i];
            i++;
            w++;
        }else{
            ans[w] = arr[j];
            j--;
            w++;
        }
       }
       temp = head;
        for (int value : ans) {
            temp.val = value;
            temp = temp.next;
        }
    }
}
