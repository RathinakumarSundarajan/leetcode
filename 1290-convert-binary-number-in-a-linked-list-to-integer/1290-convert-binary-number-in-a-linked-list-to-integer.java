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
    public int getDecimalValue(ListNode head) {
        
        int answer = 0;
        
        while (head != null){
            
            answer = answer * 2;
            
            answer = answer + head.val;
            
            head = head.next;
            
        }
        
        return answer;
        
    }
}