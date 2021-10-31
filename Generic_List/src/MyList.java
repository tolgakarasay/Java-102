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
            if (i != size - 1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }

    public int indexOf(T data) {
        int i = 0;
        while (i < size) {
            if (this.arr[i] == data) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int i = size - 1;
        while (i >= 0) {
            if (this.arr[i] == data) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public T[] toArray() {
        return this.arr;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            this.arr[i] = null;
        }
        size = 0;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> temp = new MyList(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            temp.add(this.arr[i]);
        }
        return temp;
    }

    public boolean contains(T data) {
        int i = 0;
        while (i < size) {
            if (this.arr[i] == data) {
                return true;
            }
            i++;
        }
        return false;
    }
}
