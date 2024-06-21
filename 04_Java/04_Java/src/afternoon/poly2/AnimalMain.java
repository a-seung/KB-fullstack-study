package afternoon.poly2;

public class AnimalMain {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();

        donkey.sound();
        dog.sound();
        cat.sound();
        chicken.sound();

        soundAnimal(donkey);
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(chicken);
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
        // 메서드는 하난데 전달되는 객체가 다르면 다른 값이 나옴
        // animal에 어떤 동물이 오냐에 따라 다른걸 출력

    }

}
