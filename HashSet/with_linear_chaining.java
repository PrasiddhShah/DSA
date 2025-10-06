class Hashset {
    Node head;
    Node[] storage;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Hashset() {
        this.storage = new Node[1000];
    }

    public int hash(int value) {
        return value % 1000;
    }

    public Node find(Node head, int value) {
        Node prev = head;
        Node cur = head.next;
        while (cur != null && cur.value != value) {
            prev = cur;
            cur = prev.next;
        }
        return prev;
    }

    public void add(int value) {
        int hash = hash(value);
        if (storage[hash] == null) {
            storage[hash] = new Node(-1);
        }
        Node prev = find(storage[hash], value);
        if (prev.next == null) {
            prev.next = new Node(value);
        } else {
            prev.next.value = value;
        }
    }

    public boolean contains(int value) {
        int hash = hash(value);
        if (storage[hash] == null)
            return false;
        Node prev = find(storage[hash], value);
        if (prev.next == null) {
            return false;
        }
        return true;
    }

    public void remove(int value) {
        int hash = hash(value);
        if (storage[hash] == null) {
            return;
        }
        Node prev = find(storage[hash], value);
        if (prev.next == null) {
            return;
        } else {
            Node temp = prev.next;
            prev.next = prev.next.next;
            temp.next = null;
        }
    }
}
