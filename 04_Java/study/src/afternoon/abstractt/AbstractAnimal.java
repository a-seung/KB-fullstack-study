package afternoon.abstractt;
// 추상적인 기능을 제공함
// 실제적으로 메서드를 정의하는 게 아니라 이름만 정해줌
// 누군가에게 상속을 시키기 위한 클래스임

abstract class AbstractAnimal {
    public abstract void sound();
    //sound라는 메서드가 있는데 자식에게 정의해서 써야한다고 강요한다는 의미
    // 인스턴스화가 불가능한 ab클래스 내부에서만 가능
    // 오버라이딩해서 자기만의 메서드로 사용하게 만드려면 이 방식

    public abstract void eat();
    // 공용으로 사용하려면 이 방식
}

