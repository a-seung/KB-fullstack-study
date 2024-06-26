package afternoon.classs;

//같은폴더 안에있는 걸 쓸땐 import 명시 없어도 됨

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("이승아", 27, 100000, false);
        customer1.printCustomerInfo();


        Customer customer2 = new Customer();
        customer2.printCustomerInfo();

    }
}
