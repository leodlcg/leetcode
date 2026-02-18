//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode aux = head;
        ListNode resultado = new ListNode(aux.val);
        ListNode auxResultado = resultado;

        while(true){

            if(aux.next == null){
                break;
            }

            if(aux.val != aux.next.val){
                auxResultado.next = new ListNode(aux.next.val);
                auxResultado = auxResultado.next;
            }

            aux = aux.next;

        }

    return resultado;
        
    }
}
