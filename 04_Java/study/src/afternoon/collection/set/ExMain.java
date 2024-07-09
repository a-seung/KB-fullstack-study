package afternoon.collection.set;

import java.util.HashSet;
import java.util.Random;

public class ExMain {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;//0-9라서 +1해줌
        }

        HashSet<Integer> set = new HashSet<>();
        //set에 배열에 만들어진 랜덤값을 하나씩 넣어줌
        for (int i = 0; i < arr.length; i++) {
            boolean isNotDuplicated = set.add(arr[i]);
            if (isNotDuplicated) {
                System.out.println("중복이 아니다!");
            } else {
                System.out.println("중복이다");
            }
        }

    }
}
