package afternoon.collection.map;

import java.util.HashMap;
import java.util.Random;

public class ExMainMap {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
        }
        // 1 - 10까지의 정수가 10개 생성

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 빈도수
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= arr.length; i++) {
            map.put(i, 0); //(키값,밸류값)
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            map.put(num, map.get(num) + 1);
        }

        System.out.println("map = " + map);
    }


}
