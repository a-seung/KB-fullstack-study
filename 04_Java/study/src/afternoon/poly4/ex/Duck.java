package afternoon.poly4.ex;

public class Duck implements Animal, Fly {
    @Override
    public void sound() {
        System.out.println("곽");
    }

    @Override
    public void eat() {
        System.out.println("오리가 사료를 먹습니다");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다");
    }
}
