package afternoon.lang.wrapper;

//오토박싱(객체로 감싸주는것), 오토언박싱(알아서 값 빼주는 것)
public class WrapperMain {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(10);
        Integer b = 10;
        // 위아래 동일함/ 자바가 자동으로 넣어줌

        Long c = 100L;

        Double d = 11.18;
        // 오토박싱

        //오토 언박싱이 적용되므로 값이 나오는 것임
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
