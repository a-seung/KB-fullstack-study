package afternoon.abstractt;

public class Dog extends AbstractAnimal {
    @Override
    //왼쪽아이콘은 실체가 없던애를 구현한거라서 I
    public void sound() {
        System.out.println("강아지는 멍멍");
    }

    @Override
    public void eat() {
        System.out.println("강아지가 사료를 먹습니다.");
    }
}
