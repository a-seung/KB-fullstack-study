package afternoon.nested.Inner.ex1;

public class Engine {
    private Car car;

    public Engine(Car car) {
        this.car = car;
        // 외부에서 카를 가져와서 this.car에 넣었기 때문에 주소를 알고 있음
    }

    public void start() {
        System.out.println("자동차 주유 상태 확인 : " + car.getOilAmount());
        if(car.getOilAmount() > 0) {
            System.out.println(car.getModel() + "의 엔진을 구동합니다!");
        }
    }
}
