package afternoon.memory;

public class DataStaticMain {
    public static void main(String[] args) {
        System.out.println(DataStatic.value);
        DataStatic.showValue();

        // static 덕분에 인스턴스화 없이 바로 사용가능한 것임
    }
}
