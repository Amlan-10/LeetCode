class Solution {
    
    public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null) {
        return head;
    }

    ListNode prev = null, cur = head, next = null;
    int cnt = 0;

    // Count the number of nodes in the current group
    ListNode temp = head;
    while (temp != null && cnt < k) {
        temp = temp.next;
        cnt++;
    }

    // If there are less than k nodes remaining, return the original head
    if (cnt < k) {
        return head;
    }

    // Reverse the current group
    cnt = 0;
    while (cur != null && cnt < k) {
        next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
        cnt++;
    }

    // Update the original head's next to the result of the recursive call
    head.next = reverseKGroup(next, k);

    return prev;
}

}
