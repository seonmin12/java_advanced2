package InnerClass.ex01;

//인스턴스 멤버 클래스 B를 A 클래스 내부에서 생성
//B객체는 A클래스 내부 어디에서나 생성할 수 없고, 인스턴스 필드값, 생성자, 메소드에서 생성할 수 있음
public class A {
    //인스턴스 멤버 클래스
    class B{}

    //인스턴스 필드 값으로 B 객체 생성한 후 대입
    B field = new B();

    //생성자
    A(){
        B b = new B();
    }

    //인스턴스 메소드
    void method(){
        B b = new B();
    }


}
