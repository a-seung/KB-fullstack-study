package afternoon.access.refactor;

public class AccountRefactor {
    public String bank; // 아무나, 어디서나 접근할 수 있는 public
    String grade; // 같은 패키지에서만 접근 가능한 default => 여태 만든건 default 였음
    private String name; // 자기가 정의된 클래스에서만 접근 가능
    private int balance;


    //생성자 만들어주는 작업
    public AccountRefactor(String bank, String grade, String name, int balance) {
        this.bank = bank;
        this.grade = grade;
        this.name = name;
        this.balance = balance;
    }
}
