package afternoon.exception.basic.ex1;

public class Ex1Main {
    static class Parent {};
    // 중첩클래스
    static class Child extends Parent {
        void childMethod() {
            System.out.println("Child.childMethod");
        }
    };

    public static void main(String[] args) {
        try {
            Parent parent = new Parent();
            Child poly = (Child) parent;// 부모를 차일드 타입으로 캐스팅해줌
            poly.childMethod();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        System.out.println("예외 처리 완료!");
    }

}

