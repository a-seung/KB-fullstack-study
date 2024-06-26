package afternoon.ref;

public class CustomerMain2 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(); // 두개 다 인스턴스화
        Customer customer2 = new Customer();

        customer2 = customer1;

    }
}
