package pl.javastart.task;

import java.util.Arrays;
// Uzupełnij klasę. Możesz ją dowolnie modyfikować.
// Celem jest, żeby przechodziły testy w src/test/java/[...]/CustomListTest

public class CustomList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    private void checkCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) elements[index];
    }

    public void add(T element) {
        checkCapacity();
        elements[size] = element;
        size++;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        checkCapacity();
        for (int i = size; i > index; i--) {        // 1 2 3 4 5
            elements[i] = elements[i - 1];          // 1 2 * 3 4 5
        }
        elements[index] = element;
        size++;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = index; i < size - 1; i++) {    // 1 2 3 4 5
            elements[i] = elements[i + 1];          // 1 * 3 4 5
        }
        elements[size - 1] = null;
        size--;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.append(elements[size - 1]).append("]");
        return builder.toString();
    }
}
