package InnerClass.ex06.basic;

public class HamburgerLotteria {
    public static void main(String[] args) {
        Hamburger 선민 = new Hamburger(2,1,2,4,6,8);
        Hamburger 유진 = new Hamburger(2,1,1);
        Hamburger 성빈 = new Hamburger(2,1,1,4,5,6);

    }
}

//단점: 인스턴스 필드들이 많아질수록 생성자가 계속 많아져야 함, 매개변수 순서도 맞춰줘야됨
//생성자 만으로는 필드를 선택적으로 생략할 수 없는 방식
//타입이 다양할수록 생성자 메소드 수가 늘어나기 때문에 가독성이나 유지보수 측면에서 좋지 않다.
