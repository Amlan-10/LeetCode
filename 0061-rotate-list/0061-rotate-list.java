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
    public static ListNode findKthNode(ListNode temp,int k){
        while(temp!=null && k>0)
        {
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        int len=0;
        ListNode prev=null;
        ListNode nextNode=null;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        len++;
        if(len==0){
            return head;
        }
        k=k%len;
        if(k==0){
            return head;
        }
        else{
            prev=findKthNode(head,len-k-1);
            nextNode=prev.next;
            prev.next=null;
            temp.next=head;
            head=nextNode;
            
        }
        return head;
    }
}