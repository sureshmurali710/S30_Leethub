class LRUCache {
    
    class Node{
        Node prev;
        Node next;
        int key; int value;
        
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    
    private void removeNode(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    
    private void addNode(Node node){
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
    }
    
    HashMap<Integer, Node> map;
    
    Node head; Node tail;
    int capacity;
    

    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        removeNode(node);
        addNode(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            addNode(node);
            
        }else{
            if(capacity == map.size()){
                //remove the LRU node
                Node tailPrev = tail.prev;
                removeNode(tailPrev); //
                map.remove(tailPrev.key); //map remove
                
            }
            
            Node newNode = new Node(key, value);
            addNode(newNode);
            map.put(key, newNode);
        }
       
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */