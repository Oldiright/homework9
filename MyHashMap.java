package homework9;

import java.util.Objects;

public class MyHashMap<K, V> {
    private Bucket<K, V>[] buckets;
    private int currentSize = 0;

    public void put(K key, V value) {

        int hashIndex = Objects.hashCode(key) % 8;

        System.out.println("HashIndex =" + hashIndex);
        if (buckets == null) {
            buckets = new Bucket[8];
            buckets[hashIndex] = new Bucket<>(new SinglyLinkNode<>(key, value, null), 1);
            System.out.println("first element added.");
            currentSize++;

        } else if(buckets[hashIndex] == null) {
            buckets[hashIndex] = new Bucket<>(new SinglyLinkNode<>(key, value, null), 1);
            System.out.println("first element added in a new bucket");
            currentSize++;
        } else {
            boolean isItHere = false;
            SinglyLinkNode<K, V> currentItem = buckets[hashIndex].getLastBucketElement();
            for (int i = 0; i < buckets[hashIndex].getCurrentBucketSize(); i++) {
                isItHere = key.equals(currentItem.getKey());
                if (isItHere) {
                    currentItem.setValue(value);
                    System.out.println("Element with key " + key + " changed.");
                    break;
                }
                currentItem = currentItem.getPreviousBucketElement();
            }
            if (!isItHere) {
                buckets[hashIndex].setLastBucketElement(new SinglyLinkNode<>(key, value, buckets[hashIndex].getLastBucketElement()));
                System.out.println("element with new key added");
                buckets[hashIndex].setCurrentBucketSize(buckets[hashIndex].getCurrentBucketSize() + 1);
                currentSize++;
            }
        }


    }
    public V get(K key) {
        int hashIndex = Objects.hashCode(key) % 8;
        if(buckets[hashIndex] == null) {
            return null;
        }
        if(key.equals(buckets[hashIndex].getLastBucketElement().getKey())) {
            return buckets[hashIndex].getLastBucketElement().getValue();

        } else {
            boolean isItHere = false;
            SinglyLinkNode<K, V> searchedNode = buckets[hashIndex].getLastBucketElement();
            for (int i = 0; i < buckets[hashIndex].getCurrentBucketSize(); i++) {
                isItHere = key.equals(searchedNode.getKey());
                if(isItHere) {
                    break;
                }
                searchedNode = searchedNode.getPreviousBucketElement();

            }
            if (!isItHere) {
                System.out.println("element not found.");
                return null;
            } else {
                return searchedNode.getValue();
            }
        }

    }

    public  int size() {
        return currentSize;
    }

    public void remove(K key) {
        int hashIndex = Objects.hashCode(key) % 8;
        if(buckets[hashIndex] == null) {
            System.out.println("Item with this key no found.");
        } else if(key.equals(buckets[hashIndex].getLastBucketElement().getKey())) {
            buckets[hashIndex].setLastBucketElement(buckets[hashIndex].getLastBucketElement().getPreviousBucketElement());
            buckets[hashIndex].setCurrentBucketSize(buckets[hashIndex].getCurrentBucketSize() - 1);
            currentSize--;
        } else {
            boolean isItHere = false;
            SinglyLinkNode<K, V> searchedNode = buckets[hashIndex].getLastBucketElement().getPreviousBucketElement();
            SinglyLinkNode<K, V> previousNode = buckets[hashIndex].getLastBucketElement();
            for (int i = 1; i < buckets[hashIndex].getCurrentBucketSize(); i++) {
                isItHere = key.equals(searchedNode.getKey());
                if(isItHere) {
                    break;
                }
                previousNode = searchedNode;
                searchedNode = searchedNode.getPreviousBucketElement();

            }
            if (!isItHere) {
                System.out.println("element not found.");

            } else {
                previousNode.setPreviousBucketElement(searchedNode.getPreviousBucketElement());
                buckets[hashIndex].setCurrentBucketSize(buckets[hashIndex].getCurrentBucketSize() - 1);
                currentSize--;
            }
        }
    }
    public void clear() {
        buckets = null;
        currentSize = 0;

    }


}
