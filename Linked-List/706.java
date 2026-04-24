class MyHashMap {

    private static class Node {
        int key, value;
        Node next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int SIZE = 1000;
    private Node[] table;

    public MyHashMap() {
        table = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int idx = hash(key);
        Node curr = table[idx];

        // If bucket empty
        if (curr == null) {
            table[idx] = new Node(key, value);
            return;
        }

        Node prev = null;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value; // update
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        // Insert at end
        prev.next = new Node(key, value);
    }

    public int get(int key) {
        int idx = hash(key);
        Node curr = table[idx];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int idx = hash(key);
        Node curr = table[idx];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    table[idx] = curr.next; // remove head
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
