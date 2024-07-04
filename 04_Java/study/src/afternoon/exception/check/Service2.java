package afternoon.exception.check;

public class Service2 {
    public static void main(String[] args) {
        Client client = new Client();

        try {
            client.callRandException();
        } catch (MyCheckException2 e) {
            e.printStackTrace();
        }
        System.out.println("막았는가?");
    }
}
