package ch13;

public interface Storage<T> {
    void add(T item, int index);
    T get(int index);
}
