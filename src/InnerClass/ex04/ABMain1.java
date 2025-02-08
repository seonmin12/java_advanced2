package InnerClass.ex04;

class A{
    static class B{

        B field1 = new B();

        static B field2 = new B();

        void A(){
            B b = new B();
        }

        void method1(){
            B b = new B();
        }

        static void method2(){
            B b = new B();
        }

    }


}

public class ABMain1 {

    public static void main(String[] args) {
        //정적 멤버클래스 B는 A.B() 직접 호출, 생성이 가능함
        A.B b = new A.B();
    }
}
