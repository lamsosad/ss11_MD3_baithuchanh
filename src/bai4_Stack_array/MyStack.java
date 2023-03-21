package bai4_Stack_array;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    //push(): chèn phần tử mới vào stack
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    //isFull(): kiểm tra xêm stack có đầy không
    private boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    //pop(): xoá phần tử khỏi stack
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    //isEmpty(): kiểm tra xem stack có rỗng không
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    //size(): trả về số phần tử hiện tại của stack
    public int size() {
        return index;
    }


}
