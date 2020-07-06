package com.wenmq.algo.linklist;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ifans.wen
 * @date 2020/7/3
 * @description
 */
public class LinkListSolution {

    private static final LinkListSolution ourInstance = new LinkListSolution();

    public static LinkListSolution getInstance() {
        return ourInstance;
    }

    private LinkListSolution() {
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow, fast;
        slow = head;
        fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


    public static ListNode reverseList(ListNode head) {

        ListNode pre, cur;
        pre = null;
        cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }


    public static ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode p0 = new ListNode(-1);
        p0.next = head;
        while (p0.next != null && p0.next.val != val) {
            p0 = p0.next;
        }
        if (p0.next != null) {
            p0.next = p0.next.next;
        }
        return head;
    }


    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p.val);
            p = p.next;
        }
        int[] result = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            result[index] = stack.pop();
            index++;
        }
        return result;
    }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null) return null;
        if (headB == null) return null;
        ListNode ap = headA;
        ListNode bp = headB;
        while (ap != bp) {
            ap = ap != null ? ap.next : headB;
            bp = bp != null ? bp.next : headA;
        }
//        if(result is null) {ap == bp == null}
        return ap;
    }

    public static ListNode reverseList2(ListNode head) {
        return reverseOne(head);
    }

    public static ListNode reverseOne(ListNode a) {
        if (a == null || a.next == null) return a;
        ListNode next = reverseOne(a.next);
        a.next.next = a;
        a.next = null;
        return next;
    }


    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p0;
        p0 = new ListNode(-1);
        p0.next = head;
        ListNode result = head.next;
// 1-2-3-4

// 2-1-3-4

        while (p0.next != null && p0.next.next != null) {
            ListNode p1 = p0.next;
            ListNode p2 = p1.next;
            ListNode p3 = p2.next;
            p0.next = p2;
            p2.next = p1;
            p1.next = p3;
            p0 = p2;
        }
        return result;


    }


    public static ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p0, p1, p2;
        p0 = new ListNode(-1);
        p0.next = head;
        ListNode p3;
        ListNode result = head.next;

        while (p0.next != null && p0.next.next != null) {
            p1 = p0.next;
            p2 = p1.next;
            p3 = p2.next;
            p1.next = p3; // p2 lost
            p2.next = p1; // p3 lost
            p0.next = p2;
            p0 = p1;
        }
        return result;

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        int isAdd = 0;
        ListNode head = new ListNode(-1);
        ListNode p0 = head;

        while (p1 != null || p2 != null || isAdd != 0) {
            int v1 = p1 == null ? 0 : p1.val;
            int v2 = p2 == null ? 0 : p2.val;
            p0.next = new ListNode((v1 + v2 + isAdd) % 10);
            isAdd = (v1 + v2 + isAdd) / 10;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
            p0 = p0.next;
        }
        return head.next;


    }


    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] list = new ListNode[k];
        int len = 0;
        ListNode helper = root;
        while (helper != null) {
            helper = helper.next;
            len++;
        }
        int mode = len % k;
        int sublen = len / k;
        helper = root;
        for (int i = 0; i < k; ++i) {
            ListNode head = helper;
            for (int j = 0; j < sublen + (i < mode ? 1 : 0) - 1; ++j) {
                if (helper != null) helper = helper.next;
            }
            if (helper != null) {
                ListNode prev = helper;
                helper = helper.next;
                prev.next = null;
            }
            list[i] = head;
        }


        return list;
    }

    public static ListNode mergeTwoList(ListNode l, ListNode r) {
        if (l == null) return r;
        if (r == null) return l;
        ListNode p = l, q = r;
        ListNode root;
        if ((p.val < q.val)) {
            root = p;
            p = p.next;
        } else {
            root = q;
            q = q.next;
        }
        ListNode now = root;
        while (p != null && q != null) {
            if (p.val < q.val) {
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


//    String addStr(String longa, String longb) {
//        int lena, lenb;
//        lena = longa.length();
//        lenb = longb.length();
//        char cur;
//        int isAdd = 0;
//        for (int i = 0; i < Math.max(lena, lenb); i++) {
//            char a = longa.charAt(lena - i);
//            char b = longb.charAt(lenb - i);
//            int aa = a - '0'; // 0123456789
//            int bb = b - '0';
//            cur = (char) ('0' + ((aa + bb + isAdd) % 10));
//            isAdd = (aa + bb + isAdd) / 10;
//
//
//        }
//
//
//    }


    public static void main(String[] args) {
//        ListNode a = new ListNode(1);
//        a.appendNewNode(2)
//                .appendNewNode(3)
//                .appendNewNode(4)
//                .appendNewNode(5)
//                .appendNewNode(6);
//        ListNode b = new ListNode(2);
//        b.appendNewNode(2);
//
//        printAll(a);
//        printAll(b);
//        printAll(getKthFromEnd(a, 2));
//        printAll(reverseList(a));
//        printAll(deleteNode(a, 4));
//        printAll(getIntersectionNode(a, b));
//        ListNode a1 = swapPairs(a);
//        printAll(a1);
//        printAll(addTwoNumbers(a, b));

        ListNode a = new ListNode(10);
        a.appendNewNode(2)
                .appendNewNode(31)
                .appendNewNode(24)
                .appendNewNode(53)
                .appendNewNode(6);
        System.out.println("+" + (2 << 1));
        printAll(sortList1(a));
    }

    private static void printAll(ListNode a) {
        ListNodeHelper.printAll(a);
    }


    // deep copy mean create a bijection (old 2 new)
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node, Node> nnMap = new HashMap<>();
        Node p = head;
        while (p != null) {
            nnMap.put(p, new Node(p.val));
            p = p.next;
        }
        Node p1 = head;
        while (p1 != null) {
            nnMap.get(p1).next = nnMap.get(p1.next);
            nnMap.get(p1).random = nnMap.get(p1.random);
            p1 = p1.next;
        }
        return nnMap.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


    //////// copy

    public ListNode sortList(ListNode head) {
        return head == null ? null : mergeSort(head);
    }

    static private ListNode mergeSort(ListNode head) {
        if (head == null) return head;
        int len = 0;
        ListNode p = head;
        ListNode dummy = new ListNode(-1);
        ListNode curr = null;
        dummy.next = head;
        while (p != null) {
            p = p.next;
            len++;
        }
        for (int i = 1; i < len; i *= 2) {
            p = dummy.next;
            curr = dummy;
            ListNode left1 = null;
            ListNode left2 = null;
            ListNode right1 = null;
            ListNode right2 = null;
            int cnt = 0;
            for (int j = 0; j < len; j++) {
                if (cnt == 0) {
                    left1 = p;
                }
                if (cnt == i - 1) {
                    right1 = p;
                }
                if (cnt == i) {
                    left2 = p;
                }
                if (cnt == i << 2 - 1 || p.next == null) {
                    right2 = p;
                    p = right2.next;
                    if (left2 != null) {
                        right1.next = null;
                        right2.next = null;
                        curr.next = merge(left1, left2);
                    } else {
                        curr.next = merge(left1, null);
                    }
                    cnt = 0;
                    while (curr.next != null) {
                        curr = curr.next;
                    }
                    left1 = left2 = right1 = right2 = null;
                    continue;
                }
                p = p.next;
                cnt++;
            }

        }


        return dummy.next;
    }

//    public static ListNode merge(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//        ListNode dummy = new ListNode(-1);
//        ListNode cur = dummy;
//        while (l1 != null && l2 != null) {
//
//            if (l1.val < l2.val) {
//                cur.next = l1;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                l2 = l2.next;
//
//            }
//            cur = cur.next;
//        }
//        if (l1 != null) cur.next = l1;
//        if (l2 != null) cur.next = l2;
//        return dummy.next;
//
//    }


    public static ListNode sortList1(ListNode head) {
        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        dummyHead.next = head;
        // 先统计长度f
        ListNode p = dummyHead.next;
        int length = 0;
        while(p != null){
            ++length;
            p = p.next;
        }
        // 循环开始切割和合并
        for(int size = 1; size < length; size <<= 1){
            ListNode cur = dummyHead.next;
            ListNode tail = dummyHead;
            while(cur != null){
                ListNode left = cur;
                ListNode right = cut(cur, size); // 链表切掉size 剩下的返还给right
                cur = cut(right, size); // 链表切掉size 剩下的返还给cur
                tail.next = merge(left, right);
                while(tail.next != null){
                    tail = tail.next; // 保持最尾端
                }
            }
        }
        return dummyHead.next;
    }

    /**
     * 将链表L切掉前n个节点 并返回后半部分的链表头
     * @param head
     * @param n
     * @return
     */
    public static ListNode cut(ListNode head, int n){
        if(n <= 0) return head;
        ListNode p = head;
        // 往前走n-1步
        while(--n > 0 && p != null){
            p = p.next;
        }
        if(p == null) return null;
        ListNode next = p.next;
        p.next = null;
        return next;
    }

    /**
     * 合并list1和list2
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode(Integer.MIN_VALUE), p = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            } else{
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1 == null){
            p.next = list2;
        } else{
            p.next = list1;
        }
        return dummyHead.next;
    }





}
