
public class Solution {
    public static void main(String[] args) {

        int[] arr = {3, 3, 3};

        ListNode node = new ListNode(1);

        node.next = new ListNode(1);
        node.next.next = new ListNode(2);

        deleteDuplicates(node);

        traversalHead(node);

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val==currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;

    }


    static ListNode insert(ListNode root, int item) {
        ListNode temp = new ListNode();
        ListNode ptr;
        temp.val = item;
        temp.next = null;

        if (root == null)
            root = temp;
        else {
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
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


