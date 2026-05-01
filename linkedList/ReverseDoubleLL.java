package linkedList;

import util.DoubleLL;

public class ReverseDoubleLL {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };

        DoubleLL head = DoubleLL.generatDoubleLL(arr);
        DoubleLL.printLL(head);
    }

    public static DoubleLL reverseDLL(DoubleLL head) {
        DoubleLL previousNode = null;

        DoubleLL current = head;

        while (current != null) {
            previousNode = current.prev;
            current.prev = current.next;
            current.next = previousNode;
            current = current.prev;
        }
        return previousNode.prev;
    }

}
