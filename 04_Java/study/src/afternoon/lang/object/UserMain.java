package afternoon.lang.object;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("이승아", "salee981119");
        User user2 = new User("이승아", "salee981119");

        System.out.println(user1 == user2); // 주소값 다르기 때문에 false
        System.out.println(user1.equals(user2)); // 오버라이딩 안되어 있으면 위와 똑같은 주소값 비교임
        // 깊은 비교하려면 오버라이딩 해서 사용해야함


    }
}
