package afternoon.exception.basic;

public class ExceptionLetitgo {
    public static void main(String[] args) {
        // 예외 상황 발생 시키기 1. 배열 접근
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[5]);

//        System.out.println("나오나요?!");
        // ArrayIndexOutOfBoundsException 에러 뜸 => 런타임에러
        // 컴파일에러는 아예 실행이 안됨
    }
}
