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

// Solution class
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     

        int carry=0;
        int sum=0;
        ListNode dummyNode =new ListNode(-1,null);

        ListNode t1=l1;
        ListNode t2 =l2;
        ListNode newNode;
ListNode curr =dummyNode;
        while (t1 !=null || t2 != null) {
            sum =carry;

            if(t1 != null){
                 sum+=t1.val;
                 t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            }
            int newValue =sum %10;
            carry =sum/10;
            newNode=new ListNode(newValue);
            curr.next =newNode;
            curr=newNode;

        }
        if(carry!=0){
          newNode=new ListNode(carry);
            curr.next =newNode;
            curr=newNode;
        }
return dummyNode.next;
    }
}