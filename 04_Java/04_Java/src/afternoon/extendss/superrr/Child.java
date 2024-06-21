package afternoon.extendss.superrr;

public class Child extends Parent {

    //생성자 선언
    public Child(String name) {
        super(); // Parent(); 부모의 기본 생성자, 생략 가능
        System.out.println("Child 생성자");
    }

    public Child(String name, int age) {
        super(); // 생략된 부모의 기본 생성자
        System.out.println("Child 생성자 2");
    }


}
