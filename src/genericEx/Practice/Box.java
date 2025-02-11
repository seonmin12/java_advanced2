package genericEx.Practice;
//어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box. 객체를 설정하고 가져오는 메소드를 구현하세요.
public class Box<T> {
    private T t;
    private int size = 0;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Box<String>stringBox = new Box<>();
        System.out.println(stringBox.getT());
        System.out.println(stringBox.getSize());
    }
}
