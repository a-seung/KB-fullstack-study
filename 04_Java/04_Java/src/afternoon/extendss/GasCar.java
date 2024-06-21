package afternoon.extendss;

public class GasCar extends Car {
    @Override // annotation /부모랑 타입, 이름 똑같아야 하는데 그런 룰을 지키고 있는지 봐줌
    //왼쪽 아이콘 부모의 것을 바꾸고 있다는 의미(오버라이드)
    public void move() {
        System.out.println("기름차가 이동합니다!");
    }

    @Override
    public void openDoor() {
        System.out.println("기름차 문을 엽니다!");
    }

    public void fillUp() {
        System.out.println("가스차가 주유합니다.");
    }


}
