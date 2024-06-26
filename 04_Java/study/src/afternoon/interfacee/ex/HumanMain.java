package afternoon.interfacee.ex;

public class HumanMain {
    public static void main(String[] args) {
        // 배열의 타입은 모든걸 담을 수 있는 Human타입임
        Human[] humans = { new Korean(), new American(), new Spanish() };

        for(Human h : humans) {
            humanCall(h);
        }
    }

    public static void humanCall(Human human) {
        human.speak();
        human.eat();
        human.hello();
    }
}
