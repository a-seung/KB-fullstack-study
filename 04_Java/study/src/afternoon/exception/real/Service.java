package afternoon.exception.real;

import afternoon.exception.uncheck.MyCheckException;
import afternoon.exception.uncheck.MyUnCheckException;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();

        try{
            client.callException();
            client.callException2();
        } catch (Exception e) {
            // 모든 예외를 담을 수 있는 최상위인 Exception으로 받음
            // e.printStackTrace(); 사용하지 않고 모든 예외 처리를 하는 메서드를 사용
            exceptionHandler(e);
        }
    }

    public static void exceptionHandler (Exception e) {
        System.out.println("시스템 : 죄송합니다. 알 수 없는 문제가 발생 했습니다!");

        //개발자가 볼 수 있게 로그를 찍음
        System.out.println("===== 개발자만 보세요 =====");
        e.printStackTrace();

        // 에러 타입에 따라 다르게 예외 처리
        // instanceof 왼쪽이 오른쪽에 들어갈 수 있으면 true
        if (e instanceof MyCheckException) {
            System.out.println("MyCheckException에서 발생한 에러입니다.");
            // MyCheckException 에서만 쓰는 메서드 활용을 위한 다운캐스팅
            MyCheckException myCheckException = (MyCheckException) e;
            myCheckException.getMessage();
        } else if (e instanceof MyUnCheckException) {
            System.out.println("MyUnCheckException에서 발생한 에러입니다.");
            // MyUnCheckException 에서만 쓰는 메서드 활용을 위한 다운캐스팅
            MyUnCheckException myUnCheckException = (MyUnCheckException) e;
            myUnCheckException.getMessage();
        }
    }
}
