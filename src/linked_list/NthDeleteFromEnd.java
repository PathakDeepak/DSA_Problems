package linked_list;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * </p>
 * Sol: Here Rather than traversing to get size and then going to size-nth node and deleting it,
 *      We can use some pointer approach like Prev, First, and Nth node.
 *
 */
public class NthDeleteFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int nthFromEnd = 2;

        System.out.print("Original List: ");
        printList(head);

        // Call the method to remove the 1st node from the end
        NthDeleteFromEnd sol = new NthDeleteFromEnd();
        ListNode updatedHead = sol.removeNthFromEnd(head, nthFromEnd);

        System.out.print("After removing 1st node from end: ");
        printList(updatedHead);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        while(n > 0 && second != null) {
            second = second.next;
            n--;
        }
        if (n > 0){
            return null;
        } else if (n == 0 && second == null) {
            ListNode temp = head;
            temp = temp.next;
            head = temp;
        }
        else {
            while (second.next != null){
                second = second.next;
                first = first.next;
            }
            first.next = first.next.next;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}


