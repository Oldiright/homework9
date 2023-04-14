package homework9;

public class MyNode<T> {
    private MyNode<T> previousElement;
    private  MyNode<T> nextElement;
    private T currentElement;



    MyNode( MyNode<T> previousElement,  MyNode<T> nextElement, T currentElement) {
        this.currentElement = currentElement;
        this.nextElement = nextElement;
        this.previousElement = previousElement;
    }

    MyNode( MyNode<T> previousElement, T currentElement) {
        this.currentElement = currentElement;
        this.previousElement = previousElement;
    }



    public void setPreviousElement(MyNode<T> element) {
        this.previousElement = element;
    }

    public void setCurrentElement(T currentElement) {
        this.currentElement = currentElement;
    }

    public void setNextElement( MyNode<T> nextElement) {
        this.nextElement = nextElement;
    }

    public T getCurrentElement() {
        return currentElement;
    }

    public MyNode<T> getNextElement() {
        return nextElement;
    }

    public MyNode<T> getPreviousElement() {
        return previousElement;
    }
}
