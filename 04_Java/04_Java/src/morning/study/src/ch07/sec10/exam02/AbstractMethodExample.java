package morning.study.src.ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
         Cat cat = new Cat();
         cat.sound();

         //매개변수의 다형성
        animalSound(new Cat());
    }
     public static void animalSound(Animal animal) {
        animal.sound();
     }
}
