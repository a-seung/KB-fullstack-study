package afternoon.lang.immutable.ex;

public class ImmutableDateMain {
    public static void main(String[] args) {
        ImmutableDate date1 = new ImmutableDate(2024, 7, 1);
        ImmutableDate date2 = date1;

        System.out.println("date2의 년도만 2025년으로 변경");
        date2 = date2.setYear(2025);
        //불변객체를 만들고 값 저장을 해줘야함

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
