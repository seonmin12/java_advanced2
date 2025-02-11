package genericEx.Practice;
//어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box. 객체를 설정하고 가져오는 메소드를 구현하세요.
//2. Box 클래스를 확장하ㅕㅇ 값이 특정 타입인지 확인 메서드 추가
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
        stringBox.setT("string");

        Box<Integer>integerBox = new Box();
        integerBox.setSize(5);

        System.out.println(stringBox.getT());
        System.out.println(stringBox.getSize());

        System.out.println(integerBox.isOfType(Integer.class));
        System.out.println(stringBox.isOfType(String.class));
    }

    public boolean isOfType(Class<?> clazz){
        return clazz.isInstance(size);

    }
}
