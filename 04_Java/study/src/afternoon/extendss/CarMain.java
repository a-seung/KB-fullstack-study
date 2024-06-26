package afternoon.extendss;

public class CarMain {
    public static void main(String[] args) {

        //인스턴스화
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar(); //뒷 내용만 쓰고 ctrl atl v
        HydrogenCar hydrogenCar = new HydrogenCar();

        gasCar.fillUp();
        gasCar.move(); // 상속을 받은 것
        gasCar.openDoor();
        System.out.println();

        electricCar.charge();
        electricCar.move();
        electricCar.openDoor();
        System.out.println();


        hydrogenCar.fillHydrogen();
        hydrogenCar.move();
        hydrogenCar.openDoor();

        //.move()를 본인에서 찾고 없으면 부모에서 찾음

        //override 상속을 받은 것을 자식입장에서 바꾸는 것
    }
}
