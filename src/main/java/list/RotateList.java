package list;

public class RotateList {
    public static Node Rotate(Node head,int k) {
        if (head == null) {
            return head;
        }
        Node old_tail = head;
        int n;
        for (n = 1; old_tail.next !=null ; ++) {
            old_tail = old_tail.next;
        }
        old_tail.next = head;
        Node new_tail = head;
        for (int i = 0; i < n-k-1%; i++) {
            new_tail = new_tail.next;
        }

        Node newHead = new_tail.next;
        new_tail.next = null;
        return newHead;
    }
}
