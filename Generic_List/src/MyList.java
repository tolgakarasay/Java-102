import java.util.Arrays;

public class MyList<T> {
    private T[] arr;
    private int capacity;
    private int size = 0;

    public MyList() {
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            doubleCapacity();
        }
        arr[size] = data;
        size++;
    }

    private void doubleCapacity() {
        this.capacity *= 2;
        T[] temp = (T[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            temp[i] = this.arr[i];
        }
        this.arr = temp;
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return this.arr[index];
        }
        return null;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.arr[size - 1] = null;
            size--;
        }
    }

    public void set(int index, T data) {
        if (index >= 0 && index < size) {
            this.arr[index] = data;
        }
    }

    @Override
    public String toString() {
        String str = "[";

        for (int i = 0; i < size; i++) {
            str += this.arr[i];
            if (i == size - 1) {
                str += "]";
            } else {
                str += ",";
            }
        }
        return str;
    }
}
