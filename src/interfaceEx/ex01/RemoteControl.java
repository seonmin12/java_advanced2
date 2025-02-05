package interfaceEx.ex01;

public interface RemoteControl {
    //상수선언
    //가장큰 볼륨을 저장할 멤버  30 값 할당
    //가장작은 볼륨을 저장할 멤버  0 할당

    public static final int MAX_VOLUME = 30;
    int MIN_VOLUME = 0;
    public abstract void turnOn();   //

    public abstract void turnOff();  // 바디 {}

}
