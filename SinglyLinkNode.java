package homework9;

public class SinglyLinkNode<K, V> {
    private K key;
    private V value;
    private SinglyLinkNode<K, V> previousBucketElement;


    public SinglyLinkNode(K key, V value, SinglyLinkNode<K, V> previousBucketElement) {
        this.key = key;
        this.value = value;
        this.previousBucketElement = previousBucketElement;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public SinglyLinkNode<K, V> getPreviousBucketElement() {
        return previousBucketElement;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setPreviousBucketElement(SinglyLinkNode<K, V> previousBucketElement) {
        this.previousBucketElement = previousBucketElement;
    }
}
