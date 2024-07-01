package afternoon.lang.immutable;

public class RefMain {
    public static void main(String[] args) {
        User user1 = new User("이승아");
        User user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        user2.setName("소해");
        System.out.println("user2의 이름을 '소해'로 변경");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
