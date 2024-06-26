package afternoon.poly2;

// for문 사용
public class AnimalMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Donkey(), new Dog(), new Cat(), new Chicken()};
        // 타입이 배열인걸 생성
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
        // 메서드는 하난데 전달되는 인스턴스가 다르면 다른 값이 나옴
        // animal에 어떤 동물이 오냐에 따라 다른걸 출력
    }
}
