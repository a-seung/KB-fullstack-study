package afternoon.abstractt;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = new AbstractAnimal[3];
        // 타입이 AbstactaAnimal인 배열에 길이가 3개 짜리인 것을 넣음
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();


        for (AbstractAnimal animal : animals) {
            animalCall(animal);
        }

    }
    // 모두다 들어와야하니까 부모인 AbstractAnimal로
    static void animalCall(AbstractAnimal animal) {
        animal.eat();
        animal.sound();

        //duck만 가진 fly 메서드는 duck에 있는지 확인하고 써야함
        //왼쪽 것이 오른쪽에 들어갈 수 있으면 true
        if (animal instanceof Duck) {
            Duck duck = (Duck) animal;
            duck.fly();
            // ((Duck) animal).fly();
        }
    }
}
