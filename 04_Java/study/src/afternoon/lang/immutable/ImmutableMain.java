package afternoon.lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("승아");
        ImmutableUser user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        user2 = user2.setName("소해");
        //새롭게 인스턴화 작업
        System.out.println("user의 이름을 '소해'로 변경");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
