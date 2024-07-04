package afternoon.exception.uncheck;

public class MyUnCheckException extends RuntimeException {
    public MyUnCheckException(String message) {
        super(message); //super는 부모 호출
    }

}
