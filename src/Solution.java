import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {3, 3, 3};

        ListNode node = new ListNode(1);

        node.next = new ListNode(1);
        node.next.next = new ListNode(2);

        traversalHead(deleteDuplicates(node));


    }

    public static ListNode deleteDuplicates(ListNode node) {
        ListNode head = null;
        ListNode tail = null;
        int size = 0;

        ListNode current1 = node;
        int count = 0;

        while (current1 != null) {
            current1 = current1.next;
            count++;
        }

        return null;

    }





    public static void traversalHead(ListNode node) {
        ListNode currentNode = node;
        while (currentNode != null) {
            System.out.print(currentNode.val);
            if (currentNode.next != null) {
                System.out.print(" -> ");
            }
            currentNode = currentNode.next;

        }
        System.out.println("\n");
    }

}


