package afternoon.access.refactor2;

import afternoon.access.Account;
import afternoon.access.refactor.AccountRefactor;

public class AccountRefactorOuter {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("우리은행","다이아","박소해", 5000);

        // public 요소 접근
        System.out.println(account.bank);

        // default 요소 접근 => 불가 / 같은 패키지 내부에서만 접근 가능함
//        System.out.println(account.grade);

        // private 요소 접근 => 불가
//        System.out.println(account.name);

    }
}
