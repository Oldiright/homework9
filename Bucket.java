package homework9;

public class Bucket<K, V> {
    private SinglyLinkNode<K, V> lastBucketElement;
    private int currentBucketSize;

    {
        System.out.println("Bucket was created");
    }

    public Bucket(SinglyLinkNode<K, V> lastBucketElement, int currentBucketSize) {
        this.lastBucketElement = lastBucketElement;
        this.currentBucketSize = currentBucketSize;
    }

    public int getCurrentBucketSize() {
        return currentBucketSize;
    }

    public SinglyLinkNode<K, V> getLastBucketElement() {
        return lastBucketElement;
    }

    public void setCurrentBucketSize(int currentBucketSize) {
        this.currentBucketSize = currentBucketSize;
    }

    public void setLastBucketElement(SinglyLinkNode<K, V> lastBucketElement) {
        this.lastBucketElement = lastBucketElement;
    }
}
