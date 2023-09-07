import java.io.*;
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        List <ListNode> listOfLists = new ArrayList<ListNode>();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);

        listOfLists.add(head1);
        listOfLists.add(head2);
        listOfLists.add(head3);
        ListNode newHead = Solution.mergeKLists(listOfLists);
        Solution.printList(newHead);
    }


}

class Solution {
    public static ListNode mergeKLists (List<ListNode> KLists) {
        if(KLists == null) return null;
        PriorityQueue<ListNode> ListQueue = new PriorityQueue<ListNode>(KLists.size(), (a,b)-> a.value-b.value);

        //add nodes from lists to queue
        for (ListNode node:KLists) {
            if (node!=null)
                ListQueue.add(node);
        }

        ListNode newList = new ListNode(-1);
        ListNode newHead = newList;

        //Add nodes to new List
        while (!ListQueue.isEmpty()){
            newList.next=ListQueue.poll();
            newList=newList.next;

            if (newList.next!=null)
                ListQueue.add(newList.next);
        }

        return newHead.next;
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
