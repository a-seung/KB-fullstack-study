package afternoon.exception.uncheck;

public class Client {
    //uncheck라서 throws 안써줘도됨
    public void callException() {
        // uncheck예외라서 명시적으로 처리(throws ~) 안해줘도 컴파일에러 발생하지 않음
        throw new MyUnCheckException("Client.call 에서 에러 발생");// 메시지가 Throwable에 저장됨
    }

    // check라서 throws 써줘야함
    public void callException2() throws MyCheckException {
        throw new MyCheckException("Client.call 에서 에러 발생");
    }
}
