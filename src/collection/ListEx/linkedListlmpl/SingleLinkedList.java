package collection.ListEx.linkedListlmpl;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data; //데이터 저장 필드
        Node<T> next = null; // 포인터

        public Node(T data) {
            this.data = data;
        }
    }


    public void addNode(T data){
        if(head == null){
            head = new Node<T>(data); //시작 주소값
        }else{
            Node<T> node =this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);

        }

    }
    public void printAll(){
        if(head != null){
            Node<T> node =this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

}
