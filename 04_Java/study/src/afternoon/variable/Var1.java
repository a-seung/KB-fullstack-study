package afternoon.variable;

public class Var1 {
    //psvm
    public static void main(String[] args) {
        //js에는 변수설정 안하면 넘어가거나 warning이지만, java는 변수 선언하면 초기설정 필수임
        int a = 10;
        double b = 4.3;
        boolean c = true;
        char d = 'c'; // 한글자만 넣을 수 있음, 반드시 단 따옴표로 묶기
        String e = "Hello, JAVA World!"; // 반드시 쌍따옴표

        //sout
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
