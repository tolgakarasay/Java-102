public class MyList<T>{
    private T[] arr;
    private int capacity;
    private int size = 0;

    public MyList() {
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];
    }

    public MyList(int capacity){
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    public int size(){
        return size;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void add(T data){
        if(size==capacity){
            doubleCapacity();
        }
        arr[size]=data;
        size++;
    }

    private void doubleCapacity(){
        this.capacity *= 2;
        T[] temp = (T[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            temp[i] = this.arr[i];
        }

        this.arr = temp;
    }
}
