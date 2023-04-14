package homework9;



public class MyLinkedList<T> implements MyList<T> {

    int currentCollectionCapacity = 0;
    private MyNode<T> first;

    private  MyNode<T> last;

    public void add(T element) {

        if(first == null) {
            first = new MyNode<>(null, null, element);

        } else if(last == null) {
            last = new MyNode<>(first, null, element);
            first.setNextElement(last);;


        } else {
            MyNode<T> newNode = new MyNode<>(last, null, element);
            last.setNextElement(newNode);
            last = newNode;
        }
        currentCollectionCapacity++;
    }

    public int size() {
        return currentCollectionCapacity;
    }


    public T get(int index) {
        return getNode(index).getCurrentElement();
    }


    public void remove(int index) {
        System.out.println("Enter in method...");
        if(index <= currentCollectionCapacity - 1) {
            MyNode<T> removeElement;

            if(index == 0) {

                first = getNode(index + 1);
                first.setPreviousElement(null);
            } else if(index == currentCollectionCapacity - 1) {
                last.getPreviousElement().setNextElement(null);
                last = last.getPreviousElement();
            } else {
//                getNode(index - 1, 's').setNextElement(getNode(index + 1, 'e'));
//                getNode(index + 1, 'e').setPreviousElement(getNode(index - 1, 'e'));
                getNode(index - 1).setNextElement(getNode(index + 1));
                getNode(index + 1).setPreviousElement(getNode(index - 1));
            }

        }
        currentCollectionCapacity--;
    }

    private MyNode<T> getNode(int index) {
        MyNode<T> indexElement = null;

        if(index == 0) {
            indexElement = first;
        } else if(index == currentCollectionCapacity - 1) {
            indexElement = last;
        } else if (index <= currentCollectionCapacity - index - 1) {
            indexElement = first;
            for(int i = 0; i < index; i++) {
                indexElement = indexElement.getNextElement();
            }
        } else if (index > currentCollectionCapacity - index - 1) {
            indexElement = last;
            for(int i = currentCollectionCapacity - 1; i > index; i--) {
                indexElement = indexElement.getPreviousElement();
            }

        }

        return indexElement;

    }

    public void clear() {
        first = null;
        last = null;
        currentCollectionCapacity = 0;
        System.out.println("LinkedList is clear");


    }





}

    //Special getNode
//    private MyNode<T> getNode(int index, char modification) {
//        MyNode<T> indexElement = null;
//
//        if(index == 0) {
//            indexElement = first;
//        } else if(index == currentCollectionCapacity - 1) {
//            indexElement = last;
//        } else if (modification == 's') {
//            indexElement = first;
//            for(int i = 0; i < index; i++) {
//                indexElement = indexElement.getNextElement();
//            }
//        } else  if (modification == 'e') {
//            indexElement = last;
//            for(int i = currentCollectionCapacity - 1; i > index; i--) {
//                indexElement = indexElement.getPreviousElement();
//            }
//        }
//
//        return indexElement;
//
//    }




