package afternoon.polyfinal;

public class PaySystem {
    private Pay pay; // Pay 타입인 pay변수를 선언

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void payment(int amount) {
        System.out.println("결제를 시작합니다!");
        pay.pay(amount);
    }


}
