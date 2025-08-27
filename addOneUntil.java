
class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class Geeks{
    
 static Node addOne(Node head) {
      
        // Reverse the linked list
        head = reverse(head);

        // Add one to the reversed list
        head = addOneUtil(head);

        // Reverse the list again to restore
      	//the original order
        return reverse(head);
    }

    


    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

     static Node reverse(Node head) {
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node addOneUtil(Node head){
      curr=head;
      last =null;
      res=head;
    }
}