package InnerClass.ex03.refactor;

class Creature2 {
    private int life = 100;

    // private class, 오로지 Creature2 외부에서만 접근 가능한 내부 클래스 생성
    private class Animal2 {
        private String name = "Tiger";

        int getOuter() {
            return life;  //Creature2의 private 멤버를 제약없이 접근 가능
        }
    }

    public void method() {
        Animal2 animal1 = new Animal2();

        //Getter 없이 내부 클래스의 private멤버 접근
        System.out.println(animal1.name);

        //내부 클래스에서 외부 클래스 private 멤버 출력
        System.out.println(animal1.getOuter());
    }
}

public class CreatureMain2 {
    public static void main(String[] args) {
        Creature2 creature2 = new Creature2();
        creature2.method();
    }

}
