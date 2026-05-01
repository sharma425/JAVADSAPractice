package util;

public class SingleLL {

    public int val;
    public SingleLL next;

    SingleLL() {
    }

    public SingleLL(int val) {
        this.val = val;
    }

    public SingleLL(int val, SingleLL next) {
        this.val = val;
        this.next = next;
    }

    public static SingleLL generateSingleLL(int[] arr) {
        SingleLL head = null;
        SingleLL prev = null;
        for (int i = 0; i < arr.length; i++) {
            SingleLL node = new SingleLL(arr[i]);
            if (head == null) {
                head = node;
            } else {
                prev.next = node;
            }
            prev = node;
        }
        return head;
    }

    public static void printLL(SingleLL head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
