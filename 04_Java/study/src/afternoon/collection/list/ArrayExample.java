package afternoon.collection.list;

import java.util.ArrayList;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 배열 제일 뒤에 6을 추가하기
        // 자바배열은 크기값이 고정이므로 새로운 배열 생성해서 만들어줘야함
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = 6; // 새로만든 배열은 temp에 저장되어있음
        arr = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
