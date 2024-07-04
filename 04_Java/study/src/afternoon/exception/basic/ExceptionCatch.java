package afternoon.exception.basic;

public class ExceptionCatch {
    public static void main(String[] args) {
        try {
            // 예외 상황 발생 시키기 1. 배열 접근
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        } catch (Exception e) {
            e.printStackTrace();
            //에러가 어디서 부터 출발했는지 순차적으로 보여줌/스택에 담기 때문에 어디서 오류 발생했는지 추적가능
        }
        System.out.println("나오나요?!");
        // 출력됨 / 프로그램 죽지 않고 예외처리 후 찍어줌
    }
}
