 class ListNode {
    int val;
    ListNode next;
 ListNode randomPointer;
    // Default constructor
    ListNode() {}

    // Constructor with value
    ListNode(int val) {
        this.val = val;
    }

    // Constructor with value and next node
    ListNode(int val, ListNode next,ListNode randomPointer) {
        this.val = val;
        this.next = next;
        this.randomPointer= randomPointer;
    }

}

class Solution{
     ListNode insertBetween(ListNode head){
        ListNode temp= head;
        
       while(temp!=null){
         ListNode newNode =new ListNode(temp.val);
         newNode.next=temp.next;
         temp.next=newNode;
         temp=temp.next.next;
       }
       return head;
     }

     //random pointer between
     ListNode connectRandomPointer(ListNode head){
        ListNode temp= head;
        while (temp!=null) {
             if(temp.randomPointer!=null){
                temp.next.randomPointer=temp.randomPointer.next;
             }
 temp=temp.next.next;

        }
        return head;
     }
     ListNode extractCopy(ListNode head){
        ListNode temp=head;
        ListNode dummy =new ListNode(-1);
        ListNode res=dummy;
        while (temp!=null) {
           res.next= temp.next;
           temp.next=temp.next.next;
           temp=temp.next;
           res=res.next;
        }
        return dummy.next;
     }
}
