package ch02.sec11;

public class _01_VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        int v4=0;
        if (v1 > 10) {
            int v2 = v1 - 10;
            v4 = v2; // v2를 괄호 밖에서 쓸 수 없으므로 v4사용
        }
        int v3 = v1 + v4 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
        System.out.println(v3);
    }
}
