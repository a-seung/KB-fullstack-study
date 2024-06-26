package afternoon.abstractt;

public class Duck extends AbstractAnimal {
    @Override
    //왼쪽아이콘은 실체가 없던애를 구현한거라서 I
    public void sound() {
        System.out.println("오리는 꽥꽥");
    }

    @Override
    public void eat() {
        System.out.println("오리는 도토리를 먹어요");
    }

    public void fly() {
        System.out.println("오리 날다");
    }
}
