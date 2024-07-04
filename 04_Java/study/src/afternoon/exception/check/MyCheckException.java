package afternoon.exception.check;
// Exception을 상속하면 체크 예외가 된다.
public class MyCheckException extends Exception {
    public MyCheckException(String message) {
        super(message); //super는 부모 호출
    }

}
