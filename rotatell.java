 class ListNode {
    int val;
    ListNode next;

    // Default constructor
    ListNode() {}

    // Constructor with value
    ListNode(int val) {
        this.val = val;
    }

    // Constructor with value and next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        ListNode temp;
        ListNode newTail;
        int len=1;
            
        while(tail.next!=null){
            len++;
            tail=tail.next;
      }
      if(k==0 || k%len==0){
        return head;
      }
      tail.next=head;
      k=k%len;
      newTail=findNthNode(head,len-k);
      
      head=newTail.next;
newTail.next=null;
return head;
    }

    private ListNode findNthNode(ListNode temp, int i) {
        int cnt=1;
        while(temp!=null){
            if(cnt==i) return temp;
        temp=temp.next;
        cnt++;
        }
        return null;
    }
}