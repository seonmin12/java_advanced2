package InnerClass.ex06.basic;

public class Hamburger {
    // 필수 멤버
    private int bun;
    private int patty;

    //선택 멤버
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;


    public Hamburger(int bun, int patty, int cheese, int tomato, int lettuce, int bacon) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.bacon = bacon;
    }

    public Hamburger(int patty, int bun, int cheese, int lettuce, int tomato) {
        this.patty = patty;
        this.bun = bun;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }

    public Hamburger(int patty, int bun, int cheese) {
        this.patty = patty;
        this.bun = bun;
        this.cheese = cheese;
    }
}
