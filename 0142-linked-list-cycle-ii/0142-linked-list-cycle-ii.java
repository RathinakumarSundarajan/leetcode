/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            
            fast = fast.next.next;
            slow = slow.next;

            
            // Step 1: Detect Cycle
              if (fast == slow) { // Cycle found
                // Step 2: Find Cycle Start
                slow = head;  // Reset slow to head
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Cycle start node
            }
        }
        return null;
    }
        
    }

