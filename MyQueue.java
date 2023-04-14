package homework9;

public class MyQueue<T> {
    private MyNode<T> lastElement;
    private MyNode<T> firstElement;

    private int currentCapacity = 0;

    public void add(T element) {
        if(firstElement == null) {
             firstElement = new MyNode<>(null, element);
        } else if(lastElement == null){
            lastElement = new MyNode<>(null, element);
            firstElement.setPreviousElement(lastElement);
        } else {
            MyNode<T> temporaryNode = lastElement;
            lastElement = new MyNode<>(null, element);
            temporaryNode.setPreviousElement(lastElement);
        }

        currentCapacity++;

    }

    public void clear() {
        firstElement = null;
        lastElement = null;
        currentCapacity = 0;
    }

    public int size() {
        return currentCapacity;
    }

    public T peek() {
        return firstElement.getCurrentElement();
    }

    public T poll() {
        T currentElement = firstElement.getCurrentElement();
        if(currentCapacity == 1) {
            lastElement = null;

        } else {
            firstElement = firstElement.getPreviousElement();
        }
        currentCapacity--;
        return currentElement;



    }











}


