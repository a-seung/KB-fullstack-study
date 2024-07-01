package afternoon.lang.math;

import java.util.Random;
//Random 클래스는 임포트 해서 써야함

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt()); // int 범위 안의 정수가 +-구분없이 나옴
        System.out.println(random.nextDouble()); // 0 ~ 1.0 소수 랜덤
        System.out.println(random.nextBoolean()); // T,F 랜덤

        System.out.println(random.nextInt(100)); // 0 ~ 99

    }
}
