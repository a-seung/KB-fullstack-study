package afternoon.access.refactor;

import afternoon.access.Account;

public class AccountRefactorMain {
    public static void main(String[] args) {

        AccountRefactor account = new AccountRefactor("국민은행","골드", "이승아",100000000);
        //퍼블릭, 디폴트, 프라이빗, 프라이빗

        // public 요소 접근
        System.out.println(account.bank);

        // default 요소 접근 / 같은 패키지 내부에서는 접근 가능함
        System.out.println(account.grade);

        // private 요소 접근
//        System.out.println(account.name);

    }
}
