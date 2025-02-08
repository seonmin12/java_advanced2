package InnerClass.ex01;

public class ABMain {
    public static void main(String[] args) {
        //바깥 클래스인 A를 먼저 생성
        A a = new A();
        //참조해서 B 객체 생성
        A.B b = a.new B();
    }
}
