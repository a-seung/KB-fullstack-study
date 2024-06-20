package afternoon.access;

public class BankAccount {
    private int balance; // 아무나 못 건들게 private으로 설정함

    public BankAccount() {
        this.balance = 0;
    }

    //입금기능은 외부에서 누구나 사용할 수 있어야해서 public으로 설정
    public void deposit(int amount) {
        if (isValidAmount(amount)) {
            this.balance += amount;
            System.out.println("현재 잔고는 : " + this.balance + "입니다.");
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //출금기능
    public void withdraw(int amount) {
        if (isValidAmount(amount)) {
            if (isPossibleWithdraw(amount)) { // 잔고보다 많이 뽑으면 안되니까 if문 하나 더 써줌
                this.balance -= amount;
                System.out.println("현재 잔고는 : " + this.balance + "입니다.");
            } else {
                System.out.println("잔고가 부족합니다.현재 잔고는 : " + this.balance + "입니다.");
            }
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //같은 클래스라서 balance 접근이 됨
    public void getBalance() {
        System.out.println("현재 잔고는 : " + this.balance + "입니다.");
    }


    // if안의 조건식도 메서드화 시키는 작업
    private boolean isValidAmount(int amount) {
        return amount > 0;
    }

    private  boolean isPossibleWithdraw(int amount) {
        return this.balance >= amount;

    }
}
