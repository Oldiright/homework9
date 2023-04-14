package homework9;

public class MyStack<T> {

    private MyNode<T> lastElement;

    private int currentCapacity = 0;

    public void push(T element) {
        if(lastElement == null) {
            lastElement = new MyNode<>(null, element);
        } else {
            lastElement = new MyNode<>(lastElement, element);
        }

        currentCapacity++;

    }

    public void remove(int index) {
        MyNode<T> nextNode = lastElement;
        MyNode<T> previousNode = lastElement;

        for(int i = 0; i < currentCapacity - index; i++){
            nextNode = nextNode.getPreviousElement();
        }
        for(int i = 0; i < currentCapacity - 2 - index; i++){
            previousNode = previousNode.getPreviousElement();
        }

        previousNode.setPreviousElement(nextNode);
        currentCapacity--;
    }

    public void clear() {
        lastElement = null;
        currentCapacity = 0;
    }

    public int size() {
        return currentCapacity;
    }

    public T peek() {
        return lastElement.getCurrentElement();
    }

    public T pop() {
        T currentElement = lastElement.getCurrentElement();
        if(currentCapacity == 1) {
            lastElement = null;

        } else {
            lastElement = lastElement.getPreviousElement();
        }
        currentCapacity--;
        return currentElement;



    }














}