package day6;

public class MyNode<T> {
    T value;
    MyNode<T> next = null;

    public MyNode(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyNode{" + value + "}";
    }
}
