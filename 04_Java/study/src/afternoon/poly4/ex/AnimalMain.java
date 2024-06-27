package afternoon.poly4.ex;

//인터페이스는 실체를 가질수 없음
public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Duck()}; //new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();

        for (Animal animal : animals) {
            animalDo(animal);

            if (animal instanceof Fly) {
                flyDo((Fly) animal);
            }
        }
    }

    public static void animalDo(Animal animal) {
        //오버라이딩 된 메서드 2개 전부 실행시켜주기
        animal.sound();
        animal.eat();
    }

    public static void flyDo(Fly fly) {
        fly.fly();
    }
}
//클래스를 찍으면 인스턴스가 되고 힙에 보관됨
