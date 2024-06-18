package afternoon.variable;

public class Var3 {
    public static void main(String[] args) {
        double a = 0.7;
        int b = (int) a; //명시적 형변환

        System.out.println(b);

        int c = 3;
        int d = 2;
        double div = (double) c / d; //형변환 안해주면 1.0이 나옴

        System.out.println(div);
        System.out.println(3.0 / 2);


    }
}
