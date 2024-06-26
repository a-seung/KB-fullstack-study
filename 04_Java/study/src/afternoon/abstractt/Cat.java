package afternoon.abstractt;

public class Cat extends AbstractAnimal {
    @Override
    //왼쪽아이콘은 실체가 없던애를 구현한거라서 I
    public void sound() {
        System.out.println("고양이는 야옹");
    }

    @Override
    public void eat() {
        System.out.println("고양이가 츄르를 먹습니다.");
    }
}
