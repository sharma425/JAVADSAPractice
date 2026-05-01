package linkedList;

import util.SingleLL;

public class ReverseSingleLL {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };
        SingleLL head = SingleLL.generateSingleLL(arr);
        SingleLL.printLL(head);
    }

    private static SingleLL recur(SingleLL head, SingleLL tail) {
        SingleLL node = head.next;
        head.next = node.next;
        node.next = tail;
        tail = node;
        if (head.next == null)
            return node;
        return recur(head, tail);
    }

    public static SingleLL reverseListRecursion(SingleLL head) {
        if (head == null || head.next == null)
            return head;
        return recur(head, head);
    }

    public static SingleLL reverseList(SingleLL head) {
        if (head == null || head.next == null)
            return head;
        SingleLL tail = head;
        while (true) {
            SingleLL node = head.next;
            head.next = node.next;
            node.next = tail;
            tail = node;
            if (head.next == null) {
                head = node;
                break;
            }
        }
        return head;
    }

}
