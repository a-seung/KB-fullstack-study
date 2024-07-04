package afternoon.exception.uncheck;

public class Service3 {
    public static void main(String[] args) {
        Client client = new Client();

        try {
            client.callException(); // 언체크가 받아줌
            client.callException2(); // 체크가 받아줌
        } catch (Exception e) {
            //Exception이 예외의 최상위라서 따로 적어주지 않고 퉁칠 수 있음
            // 하지만 디버깅할 때 어려움
            e.printStackTrace();
        } //System.out쓰면 같은 메시지지만 회색글씨로 뜸
        System.out.println("막았는가?");
    }
}
