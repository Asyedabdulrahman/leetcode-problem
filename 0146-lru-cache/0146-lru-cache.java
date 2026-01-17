class LRUCache {

    class Node{
        int key, value; 
        Node prev, next;
        Node(int k, int v){
            key = k; 
            value = v;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node dummyHead;
    private final Node dummyTail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        dummyHead = new Node(-1,-1);
        dummyTail = new Node(-1,-1);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        removeNode(node);
        insertNextToDummy(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node existing = map.get(key);
            existing.value = value;
            removeNode(existing);
            insertNextToDummy(existing);
        }
        else {
            if(map.size() == capacity){
                Node lru = dummyTail.prev;
                removeNode(lru);
                map.remove(lru.key);
            }
            Node newNode = new Node(key,value);
            insertNextToDummy(newNode);
            map.put(key, newNode);
        }
    }

    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertNextToDummy(Node node){
        node.next = dummyHead.next;
        node.prev = dummyHead;
        dummyHead.next.prev = node;
        dummyHead.next = node;
    }








}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */