package afternoon.poly1;

public class AnimalMain {
    public static void main(String[] args) {

        //생성자 선언
        Donkey donkey = new Donkey();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();

        donkey.sound();
        dog.sound();
        cat.sound();
        chicken.sound();
    }
}
