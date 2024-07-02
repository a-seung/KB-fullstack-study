package afternoon.nested.Inner.ex3;

public class OuterClass2Main {
    public static void main(String[] args) {
        //static 없는 클래스는 인스턴스화 해줘야함 이너클래스 전에 아우터클래스부터 실체를 만들어줘야함
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();
//        OuterClass2.InnerClass innerClass = new OuterClass2().new InnerClass();

        innerClass.hello();

    }
}
