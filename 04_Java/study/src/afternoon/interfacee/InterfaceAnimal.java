package afternoon.interfacee;

public interface InterfaceAnimal {

    //인터페이스 내부에 추상 메서드는 public abstract를 생략하고 씀
    void eat(); // 추상메서드라서 구현 안해도 됨

    void sound();


}
// 인터페이스는 다중 상속이 가능함
// public abstract가 생략되어있기 때문에 메서드에 실제 구현 코드를 절대 가질 수 없음