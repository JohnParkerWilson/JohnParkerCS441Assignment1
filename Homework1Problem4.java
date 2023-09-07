import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head = Solution.RemoveNthNode(head, 2);
        Solution.printList(head);

    }


}

class Solution {
    public static ListNode RemoveNthNode (ListNode head, int n) {
        ListNode x = head;
        int len = 0;
        //Get length
        while(x != null) {
            System.out.print(x.value + " ");
            len++;
            x = x.next;
        }
        System.out.println("length: " + len);

        x = head;
        ListNode y = x;
        for (int i = 0; i < (len-n); i++) {
            y = x;
            x = x.next;
        }
        //"delete" node at Nth from end
        y.next = x.next;



        return head;
    }

    public static void printList (ListNode head) {
        ListNode node = head;
        System.out.print("[");
        while(node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.print("]");
    }
}

class ListNode {
    int value;
    ListNode next;
    public ListNode(int value) {
        this.value = value;
    }
    public ListNode(int value, ListNode next) {
        this.value = value; this.next = next;
    }
}
