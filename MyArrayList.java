package Java_base_hw3;

import java.util.Arrays;

public class MyArrayList<E> {

    private final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int current_capacity;
    private int size;

    public MyArrayList(int initial_capacity) {
        this.array = new Object[initial_capacity];
        this.current_capacity = initial_capacity;
    }

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.current_capacity = DEFAULT_CAPACITY;
    }

    private void increaseArrayCapacity() {
        size++;
        if (size > current_capacity) {
            current_capacity = (int) Math.ceil(array.length * 1.5);
            array = Arrays.copyOf(array, current_capacity);
        }
    }

    public void add(E e) {
        increaseArrayCapacity();
        array[size - 1] = e;
    }

    public void add(int index, E e) {
        increaseArrayCapacity();
        System.arraycopy(array, index, array, index + 1, size - 1 - index);
        array[index] = e;
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + " ");
//        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        return (E) array[index];
    }

    public void set(int index, E e) {
        array[index] = e;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i] + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.append("]").toString();
    }

}
