package collection.ListEx.linkedListlmpl;

public class Node<T> {
    T data; //데이터 저장 필드
    Node<T> next = null; // 포인터

    public Node(T data) {
        this.data = data;
    }
}
