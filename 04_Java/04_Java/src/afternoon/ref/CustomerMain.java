package afternoon.ref;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(); //인스턴스화
        customer1.name = "이승아";

        Customer customer2 = null;

        System.out.println(customer2.name);
        // NullPointerException에러 => 빨간줄도 없는 런타임에러


//        customer2 = customer1;
//        System.out.println(customer2.name);
//        System.out.println(customer1.name);


    }
}
