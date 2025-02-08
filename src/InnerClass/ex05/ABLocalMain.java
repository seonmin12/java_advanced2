package InnerClass.ex05;
//로컬 클래스는 생성자와 메소드가 실행될 동안만 유효한 객체를 생성

class A{

    public A(){
        class B{}
        B b = new B();
    }

    void method(){
        class B{}
        B b = new B();
    }
}

public class ABLocalMain {

    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}
