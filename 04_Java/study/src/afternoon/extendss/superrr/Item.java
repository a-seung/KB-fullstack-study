package afternoon.extendss.superrr;

public class Item {
    //    웬만한 멤버 필드들은 private으로 만들기
    private String name;
    private int price;

    // 부모생성자에 매개변수 2개 = > super()안에 매개변수 2개 줘야함
    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("아이템 이름은 : " + this.name);
        System.out.println("아이템 가격은 : " + this.price);
    }
}
