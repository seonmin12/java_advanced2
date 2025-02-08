package interfaceEx03;

public class Main {
    public static void main(String[] args) {
        ABCImpl abcImpl = new ABCImpl();

        A ia = abcImpl; //자동 프로모션
        ia.methodA();;
        System.out.println();

        B ib = abcImpl;
        ib.methodB();
//        ib.methodA();
        C ic = abcImpl;
        ic.methodC();
        ic.methodA();
        ic.methodB();
    }
}
//자식 인터페이스를 구현한 클래스는 자식의 인터페이스 메소드 뿐만 아니라 부모 인터페이스의 모든
//추상 메소드를 재정의 해야 하며 , 구현 객체는 자식 및 부모 인터페이스 변수에 대입될 수 있다.
//자식인터페이스 변수 = new 구현 클래스();
//부모인터페이스1 변수 = new 구현클래스();
//부모인터페이스1 변수 = new 구현클래스();
//구현 객체가 자식 인터페이스 변수에 대입되면, 자식 및 부모 인터페이스의 추상 메소드를 모두 호출 가능
//부모 인터페이스 변수에 대입되면 부모인터페이스에 선언된 추상 메소드만 호출이 가능하다