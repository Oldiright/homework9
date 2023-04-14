package homework9;

public interface MyList<T> {
    T get(int index);
    void remove(int index);
    int size();
    void add(T element);
    void clear();



}
