package afternoon.exception.basic;

public class ExceptionFinally {
    public static void main(String[] args) {
        try {
            Object obj = null;
            obj.equals(null); // 에러 발생

            // System.out.println("정말 실행하고 싶은 코드");
            //try구문 안에서 에러가 났기 때문에 출력 안된 것임
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("정말 실행하고 싶은 코드");
            //예외 발생으로 프로그램이 종료되어도 finally 안에 코드는 보장됨
        }
        System.out.println("나오나요?!");
    }
}
