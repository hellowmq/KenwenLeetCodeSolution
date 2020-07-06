package com.wenmq.algo.linklist;


/**
 * 1) 单链表反转
 * 2) 链表中环的检测
 * 3) 两个有序的链表合并
 * 4) 删除链表倒数第n个结点
 * 5) 求链表的中间结点
 * <p>
 * Author: Zheng
 */
public class LinkedListAlgo {

    // 单链表反转
    public static Node reverse(Node list) {
        Node curr = list, pre = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    // 检测环
    public static boolean checkCircle(Node list) {
        if (list == null) return false;

        Node fast = list.next;
        Node slow = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) return true;
        }

        return false;
    }

    // 有序链表合并
    public static Node mergeSortedLists(Node la, Node lb) {
        if (la == null) return lb;
        if (lb == null) return la;

        Node p = la;
        Node q = lb;
        Node head;
        if (p.data < q.data) {
            head = p;
            p = p.next;
        } else {
            head = q;
            q = q.next;
        }
        Node r = head;

        while (p != null && q != null) {
            if (p.data < q.data) {
                r.next = p;
                p = p.next;
            } else {
                r.next = q;
                q = q.next;
            }
            r = r.next;
        }

        if (p != null) {
            r.next = p;
        } else {
            r.next = q;
        }

        return head;
    }

    //-----------------------------------------

    // 有序链表合并 Leetcode 21

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode soldier = new ListNode(0); //利用哨兵结点简化实现难度 技巧三
        ListNode p = soldier;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        return soldier.next;
    }


    // 删除倒数第K个结点
    public static Node deleteLastKth(Node list, int k) {
        Node fast = list;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }

        if (fast == null) return list;

        Node slow = list;
        Node prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }

        if (prev == null) {
            list = list.next;
        } else {
            prev.next = prev.next.next;
        }
        return list;
    }

    // 求中间结点
    public static Node findMiddleNode(Node list) {
        if (list == null) return null;

        Node fast = list;
        Node slow = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void printAll(Node list) {
        Node p = list;
        int i = 30;
        while (p != null && i > 0) {
            i--;
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static Node createNode(int value) {
        return new Node(value, null);
    }

    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        private Node appendNewNode(int newNodeV) {
            this.next = new Node(newNodeV, null);
            return this.next;
        }

        private Node appendNode(Node newNode) {
            this.next = newNode;
            return this.next;
        }
    }

    public static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int data, ListNode next) {
            this.val = data;
            this.next = next;
        }

        public ListNode(int data) {
            this.val = data;
            this.next = null;
        }

        public int getVal() {
            return val;
        }
    }


    public static void main(String[] args) {
//        testReverseNode();
//        testNodeCycle();
//        testMergeList();
        testRotateLinkedList();
    }

    private static void testRotateLinkedList() {
        Node head = new Node(1, null);
        head
                .appendNewNode(2)
                .appendNewNode(3)
                .appendNewNode(4)
                .appendNewNode(5)
                .appendNewNode(6);
        printAll(head);
        head = rotateRight(head, 1);
        printAll(head);
        head = rotateRight(head, 2);
        printAll(head);
        head = rotateRight(head, 5);
        printAll(head);
//
//        head = rotateRight2(head, 6);
//        printAll(head);

    }

    private static void testNodeCycle() {
        Node head = new Node(1, null);
        Node cycleInNode = new Node(999, null);
        head.appendNewNode(2)
                .appendNewNode(3)
                .appendNode(cycleInNode)
                .appendNewNode(4)
                .appendNewNode(5)
                .appendNewNode(6)
                .appendNode(cycleInNode);
        printAll(detectCycle(head));
        System.out.println(cC(cycleInNode));

    }


    private static void testMergeList() {
        Node left = new Node(1, null);
        left.appendNewNode(2)
                .appendNewNode(13)
                .appendNewNode(14)
                .appendNewNode(25)
                .appendNewNode(46);
        Node right = new Node(9, null);
        right.appendNewNode(10)
                .appendNewNode(24)
                .appendNewNode(35)
                .appendNewNode(36);
        printAll(mnl(left, right));

    }

    private static void testReverseNode() {
        Node head = new Node(1, null);
        head.appendNewNode(2)
                .appendNewNode(3)
                .appendNewNode(4)
//                .appendNewNode(5)
                .appendNewNode(6);
        printAll(head);
        Node newNode = reverse(head);

        System.out.println("-----------------------");
        printAll(newNode);
        System.out.println("-----------------------");
        printAll(r1(newNode));

    }

    public static Node mnl(Node l, Node r) {
        if (l == null) return r;
        if (r == null) return l;
        Node p = l, q = r;
        Node root;
        if ((p.data < q.data)) {
            root = p;
            p = p.next;
        } else {
            root = q;
            q = q.next;
        }
        Node now = root;
        while (p != null && q != null) {
            if (p.data < q.data) {
                now.next = p;
                p = p.next;
            } else {
                now.next = q;
                q = q.next;
            }
            now = now.next;
        }
        if (p == null) {
            now.next = q;
        } else {
            now.next = p;
        }
        return root;


    }

    // 检测环
    public static boolean cC(Node list) {
        if (list == null) return false;
        Node fast = list, slow = list;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    //    a 前缀长度
//    b 相遇冗余
//    c 环长度
//    a + b = k
//    a + b + qc = 2(a + b) (q>=1, q<b)
//    a  =  qc - b
//    a + b = qc
//    a
//
    static Node r1(Node p) {
        Node pre;
        pre = null;
        Node cur;
        cur = p;
        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public static Node detectCycle(Node head) {
        if (head == null) return null;
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;

            }
        }
        return null;
    }


    public static Node rotateRight(Node head, int k) {
        if (head == null) return null;
        int length = getNodeLength(head);
        int kmin = k % length;
        Node fast = head;
//        Node slow = head;
        for (int i = 1; i < length - kmin; i++) {
            fast = fast.next;
        }
        Node newTail = fast;
        Node newHead = fast.next;
        fast = newHead;
        while (fast.next != null) {
            fast = fast.next;
        }
        fast.next = head;
        newTail.next = null;
        return newHead;
    }

    private static int getNodeLength(Node head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;

    }

    public static Node rotateRight2(Node head, int k) {
        if (head == null)
            return head;

        int len = getNodeLength(head);
        k = k % len;    //这里是优化步骤，k如果大于链表的长度，，其旋转的结果与 k % len 次是相同的

        Node end = head;
        for (int i = 0; i < k; i++) {
            end = end.next;
        }

        Node start = head;
        while (end.next != null) {
            start = start.next;
            end = end.next;
        }

        end.next = head;
        head = start.next;
        start.next = null;


        return head;
    }

}
