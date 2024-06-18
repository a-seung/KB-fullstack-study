package afternoon.operator;

public class Op1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(a / b);

        // 문자 연산의 특이점 1
        String str = "a + b = ";
        int c = 10;
        System.out.println(str + 10); //숫자가 자동으로 문자로 형변환 됨

        // 문자 연산의 특이점 2
        int d = 10;
        char e = 'e';
        System.out.println(d + e); //char는 아스키 코드값(101)이라서 111이 나옴

    }
}
