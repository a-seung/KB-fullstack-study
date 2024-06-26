package afternoon.pack;

import afternoon.pack.a.Boss;
import afternoon.pack.nouveau.Customer;
// 누보 폴더를 임포트 해주면 값이 달라짐

public class PackageMain { //Main붙었으면 운영할 것이기 때문에 psvm쓰기
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        //나랑 같은 패키지(pack) 안에있는 Customer를 선택함


        //nouveau안의 Customer 를 선택하고 싶다면?

        afternoon.pack.nouveau.Customer customer2 = new afternoon.pack.nouveau.Customer();
        // 양쪽 형식 맞춰줘야함
        // src폴더 아래 최상위 폴더부터 순서대로 다 표시해줘야함


        Boss boss1 = new Boss("정승네트워크", 40);
        boss1.printBoss();
    }
}
