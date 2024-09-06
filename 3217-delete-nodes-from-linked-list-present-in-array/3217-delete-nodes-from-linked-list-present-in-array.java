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
    public ListNode modifiedList(int[] nums, ListNode head) {
         HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode point = dummy;
        
        while(point.next != null){
            if(set.contains(point.next.val)){
                point.next = point.next.next;
            } else{
                point = point.next;
            }
        }
        return dummy.next;
    }
}