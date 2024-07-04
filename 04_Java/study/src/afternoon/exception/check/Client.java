package afternoon.exception.check;

import java.util.Random;

public class Client {
    public void callException() throws MyCheckException {
        //발생한 곳에서 다시 던져줄땐 throws s가 붙음
        throw new MyCheckException("Client.call 에서 에러 발생");// 메시지가 Throwable에 저장됨
    }

    public void callRandException() throws MyCheckException2 {
        Random random = new Random();

        if (random.nextBoolean()) {
            throw new MyCheckException2("오늘은 운이 없으시군요.");
        } else {
            System.out.println("오늘은 운이 좋으시군요");
        }
    }
}
