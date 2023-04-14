package homework9;

import java.util.Arrays;

public class MyArrayList<T>  implements MyList<T> {
    private Object[] elements = new Object[10];
    private int lastElementIndex = 0;

    public void add(T element){

        if(lastElementIndex >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length + 1);
        }
        elements[lastElementIndex] = element;
        lastElementIndex++;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public void remove(int index) {
        if(index != 0 & index != elements.length - 1) {
            for(int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements = Arrays.copyOfRange(elements, 0, elements.length - 1);
        }

        if(index == 0) {
            elements = Arrays.copyOfRange(elements, 1, elements.length);
        }

        if(index == elements.length - 1) {
            elements = Arrays.copyOfRange(elements, 0, elements.length - 1);
        }

        lastElementIndex--;

    }
    public int size() {
        return elements.length;
    }

    public void clear() {
        lastElementIndex = 0;
        elements = new Object[0];
    }




}