package interfaceEx.ex01;

public class Radio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("라디오를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끈다.");
    }

    @Override
    public void setVolume(int volume) {

    }
    private  int memoryVolume;
   //내가 사용했던 이전 볼륨을 기억했다가 쉿모드 해제 이후 다시 복원 
    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("쉿모드 작동");
            setVolume(RemoteControl.MIN_VOLUME);
        } else{
            System.out.println("쉿모드 해제");
            setVolume(this.memoryVolume);  //원래 볼륨으로 복원됨
        }
    }
}
