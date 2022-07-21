package LeetCodeQuestion.LinkedList;
//https://leetcode.com/problems/swap-nodes-in-pairs/

public class SwapNodesInPair {

    public static class ListNode {
       int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {



    }
    public static ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null)
            return head;
        ListNode dummy=new ListNode();
        ListNode p=dummy;
        ListNode c=head;

        while(c!=null && c.next!=null)
        {
            p.next=c.next;
            c.next=p.next.next;
            p.next.next=c.next;

            c=c.next;
            p=p.next.next;

        }
        return dummy;


    }

}
