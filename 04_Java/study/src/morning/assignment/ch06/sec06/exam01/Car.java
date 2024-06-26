package morning.assignment.ch06.sec06.exam01;

public class Car {
    //필드 선언
    String model; // null
    boolean start; // false
    int speed; // 0
}

class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("모델명 : " + myCar.model);
        System.out.println("start 값은 : " + myCar.start);
        System.out.println("speed 값은 : " + myCar.speed);
    }
}
