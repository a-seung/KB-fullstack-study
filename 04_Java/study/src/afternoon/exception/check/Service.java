package afternoon.exception.check;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();

        try {
            client.callRandException();
            client.callException(); // main에서 throw하면 최상위라서 프로그램 터져버림 try/catch 구문써야함
        } catch (MyCheckException | MyCheckException2 e) {
            e.printStackTrace();
        }
        System.out.println("막았는가?");
    }
}
