package util;

public class DoubleLL {
    public int val;
    public DoubleLL prev, next;

    public DoubleLL(int val) {
        this.val = val;
    }

    public static DoubleLL generatDoubleLL(int[] arr) {
        DoubleLL head = null;
        DoubleLL prev = null;
        for (int i = 0; i < arr.length; i++) {
            DoubleLL node = new DoubleLL(arr[i]);
            if (head == null) {
                head = node;
            } else {
                node.prev = prev;
                prev.next = node;
            }
            prev = node;
        }
        return head;
    }

    public static void printLL(DoubleLL head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
