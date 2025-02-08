package InnerClass.ex05.refact;
//로컬 클래스는 생성자와 메소드가 실행될 동안만 유효한 객체를 생성
//메소드의 로컬변수는 로컬클래스가 사용할 경우 로컬 변수는 final의 특성을 갖게 되므로 값을 읽을수만 있다.
//이유: 로컬 내부에서 값을 변경하지 못하도록 제한

class A{

    //메소드
    void useB(int param){ // 단순 기능적인 부분으로만 씀. 영역이 끝나면 class B의 객체도 버림
        //A클래스의 useB()안에 정의된 로컬 클래스 B

        int value = 1; //final int value =1;
        class B{

            int field1 = 10;
            static int field2 = 20;

            public B() {
                System.out.println("B-생성자 실행");
            }

            void method1(){
                System.out.println("B-method1 실행");
//                System.out.println("원본 : " + field1);
//                field1 = 30;
//                System.out.println("수정 field1" + field1);
                System.out.println("param : " + param); // 로컬변수 읽기 가능
                System.out.println("value: " + value);  // 읽기 가능
//                param = 10; ->중첩된 클래스에서 final은 수정 불가-> 쓰기X
//                value = 30; -> 쓰기X

            }

            static void method2(){
                System.out.println("B-static method2 실행");
            }
        }

        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();

    }
}

public class ABLocalMain {

    public static void main(String[] args) {
        A a = new A();
        a.useB(10);

    }
}
