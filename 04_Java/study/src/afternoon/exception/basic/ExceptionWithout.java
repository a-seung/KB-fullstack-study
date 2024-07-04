package afternoon.exception.basic;

public class ExceptionWithout {
    public static void main(String[] args) {

        // 예외 상황 발생 시키기 1. 배열 접근
        int[] arr = {1, 2, 3, 4, 5};
        int idx = 5;

        if (idx < arr.length) {
            System.out.println(arr[idx]);
            // 코드로 예외상황을 강제로 피해버림
        } else {
            System.out.println("나오나요?!");
        }

        System.out.println(arr[5]);
        System.out.println("나오나요?!");

    }
}
