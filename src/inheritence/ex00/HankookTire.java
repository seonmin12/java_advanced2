package inheritence.ex00;

public class HankookTire extends Tire{
    @Override
    public void roll() {
        System.out.println("한국타이어 회전합니다.");
    }
}
