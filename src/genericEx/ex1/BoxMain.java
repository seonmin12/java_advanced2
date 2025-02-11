package genericEx.ex1;

public class BoxMain {
    public static void main(String[] args) {
        Box<String>stringBox = new Box<>(); // 인스턴스할때 타입 지정
        stringBox.setItem("인형");
        stringBox.setItem("기차장난감");
        stringBox.setItem("곰돌이인형");
        System.out.println(stringBox.getItem());

        System.out.println(stringBox.getCount());


    }
}
