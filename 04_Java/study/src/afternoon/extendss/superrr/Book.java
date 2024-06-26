package afternoon.extendss.superrr;

public class Book extends Item {
    private String author;
    private String title;

    Book(String name, int price, String author, String title) {
        super(name, price);
        //super.name = name; => private으로 해놔서 접근 불가
        this.author = author;
        this.title = title;
    }

    @Override
    public void print() {
        super.print(); // private 요소라서 직접 접근은 안됨
        System.out.println("책의 저자는 : " + this.author);
        System.out.println("책의 제목은 : " + this.title);
    }
}
