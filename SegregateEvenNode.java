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
    public ListNode segregateEvenOdd(ListNode l1) {
        //deletion even'

        ListNode currNode =l1;
        ListNode prev =null;

        //for even nodes
        ListNode resEnd=null;
        ListNode resStart=null;

        while(currNode != null){
            if(currNode.val %2==0){//even
                  //delete
                  if(prev==null){
                    //head
                    l1=currNode.next;
                  }else{
                    prev.next =currNode.next;
                  }

                  if(resStart==null){
                    resStart =currNode;
                    resEnd=resStart;
                  }else{
                    resEnd.next =currNode;
                    resEnd=resEnd.next;
                  }

                  
                  currNode =currNode.next;
            }else{
                  prev =currNode ;
                  currNode =currNode.next;
            }


            //remaining odd append
            //by
            if(resStart==null){
                return l1;
            }else{
                resEnd.next =l1;
            }
            return resStart;
        }
    }}