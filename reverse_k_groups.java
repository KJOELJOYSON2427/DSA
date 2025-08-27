// Definition for singly-linked list node



class ListNode {
    int val;
    ListNode next;

    // Constructors
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution{
    ListNode reverse(ListNode head, int k){
        ListNode temp=head;
    ListNode prevNode =null;
    ListNode kthNode=head;
ListNode nextNode;
    while (temp!= null) {
   
        kthNode=findKthNode(temp,k);
         
        if(kthNode==null){
            if(prevNode!=null) prevNode.next=temp;
            break;
        }
        nextNode=kthNode.next;
        kthNode.next=null;
        kthNode=reverseLinkedList(temp);
            
        if(head==temp){
            head=kthNode;
        }else{
               prevNode.next=kthNode;
        }

        prevNode=temp;

        temp=nextNode;
        

    }
    return head;
    }

    private ListNode reverseLinkedList(ListNode temp) {
   ListNode curr=temp;
   ListNode prev =null;
   ListNode Next;
        while(curr !=null){
          Next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=Next;
        }
        return prev;
    }

    private ListNode findKthNode(ListNode temp, int k) {
       k=k-1;
       while (temp!=null && k>0) {
        k--;
        temp=temp.next;
       }
       return temp;
    }
}

