
class MyHashSet {
    private boolean[][] storage;
    private int bucket;
    private int bucketItems;

    public MyHashSet() {
        this.bucket = 1000;
        this.bucketItems = 1000;
        this.storage = new boolean[bucket][];

    }

    private int hash1(int key) {
        return key % bucket;
    }

    private int hash2(int key) {
        return key / bucketItems;
    }

    public void add(int key) {
        int bucket = hash1(key);
        if (storage[bucket] == null) {
            if (bucket == 0) {
                storage[bucket] = new boolean[bucketItems + 1];
            } else {
                storage[bucket] = new boolean[bucketItems];
            }

        }
        int bucketItems = hash2(key);
        storage[bucket][bucketItems] = true;

    }

    public void remove(int key) {
        int bucket = hash1(key);
        int bucketItems = hash2(key);
        if (storage[bucket] == null) {
            return;
        }
        storage[bucket][bucketItems] = false;

    }

    public boolean contains(int key) {
        int bucket = hash1(key);
        int bucketItems = hash2(key);
        if (storage[bucket] == null) {
            return false;
        }
        if (storage[bucket][bucketItems]) {
            return true;
        } else {
            return false;
        }
    }
}