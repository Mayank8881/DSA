package ll;

public class LinkedListt {

    private Node head = null;
    private Node tail = null;
    int size = 0;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void addFirst(int data) {
        Node n = new Node(data);
        if (head == null && tail == null) {
            head = tail = n;
            System.out.println("first node " + data);
            return;
        }
        n.next = head;
        head = n;
        System.out.println("node added " + data);
    }

    public void addLast(int data) {
        Node n = new Node(data);
        if (head == null && tail == null) {
            head = tail = n;
            System.out.println("first node " + data);
            return;
        }
        tail.next = n;
        tail = n;
        System.out.println("node addedin end " + data);
    }

    public void addMiddle(int data, int idx) {
        int count = 0;
        Node n = new Node(data);
        Node temp = head;
        while (count != idx - 1) {
            temp = temp.next;
            count++;
        }
        n.next = temp.next;
        temp.next = n;
        System.out.println("node in mid" + data);

    }

    public int deleteBeg() {
        if (head == null && tail == null) {
            System.out.println("no ll");
            return -1;
        } else if (head == tail) {
            int data = head.data;
            head = tail = null;
            return data;
        } else {
            int data = head.data;
            head = head.next;
            return data;
        }
    }

    public int deleteLast() {
        if (head == null && tail == null) {
            System.out.println("no ll");
            return -1;
        } else if (head == tail) {
            int data = head.data;
            head = tail = null;
            return data;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            int data = tail.data;
            tail = temp;
            temp.next = null;
            return data;

        }
    }

    public int deleteVal(int val) {
        // if (idx == 0) {
        //     return deleteBeg();
        // }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while (val != temp.data) {
            prev = temp;
            temp = temp.next;
            // count++;
        }
        int data = temp.data;
        prev.next = prev.next.next;
        return data;
    }

    public int deleteMid(int idx) {
        if (idx == 0) {
            return deleteBeg();
        }
        Node temp = head;
        int count = 0;
        while (count != idx - 1) {
            temp = temp.next;
            count++;
        }
        int data = temp.next.data;
        temp.next = temp.next.next;
        return data;
    }

    public void display() {
        if (size == 0) {
            System.out.println("no ll");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print("=>" + temp.data);
            temp = temp.next;
        }
    }

    public void reverse() {
        Node current = head;
        Node prev = null;
        Node nest;

        while (current != null) {
            nest = current.next;
            current.next = prev;
            prev = current;
            current = nest;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }

    public boolean palindrom() {
        int count = 0;
        Node temp1 = head;
        Node temp2 = head;

        Node current = head;
        Node prev = null;
        Node nest;
        while (count != (size / 2) - 1) {
            temp1 = temp1.next;
            nest = current.next;
            current.next = prev;
            prev = current;
            current = nest;
            count++;
        }

        while (temp1.next != null) {
            if (temp2 != temp1) {
                return false;
            }
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        // Node temp = head;
        // head = tail;
        // tail = temp;
        return true;

    }

    public boolean Palindrom2() {
        Node fast = head;
        Node slow = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public boolean Cycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;

    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                break;
            }

        }

        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        // return fast.next;
        fast.next = null;
    }

    Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node merge(Node l, Node r) {
        Node newLL = new Node(-1);
        Node dumy = newLL;
        while (l != null && r != null) {
            if (l.data < r.data) {
                dumy.next = l;
                l = l.next;
                dumy = dumy.next;
            } else {
                dumy.next = r;
                r = r.next;
                dumy = dumy.next;
            }
        }
        if (l == null) {
            dumy.next = r;
        } else {
            dumy.next = l;
        }
        return newLL.next;

    }

    public void breaklist() {
        head = MergeSort(head);
    }

    Node MergeSort(Node head) {
        if (head.next == null) {
            return head;
        }
        Node mid = findMid(head);
        Node right = mid.next;
        mid.next = null;

        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(right);

        return merge(newLeft, newRight);

    }

    Node zigzag() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
