package afternoon.exception.uncheck;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();

        try {
            client.callException(); // 언체크가 받아줌
            client.callException2(); // 체크가 받아줌
        } catch (MyUnCheckException e) {
            e.printStackTrace(System.out);
            //System.out쓰면 같은 메시지지만 회색글씨로 뜸
        } catch (MyCheckException e) {
            e.printStackTrace(System.out);
        }
        System.out.println("막았는가?");
    }
}
