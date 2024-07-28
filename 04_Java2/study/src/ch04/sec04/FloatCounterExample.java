package ch04.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
        // 실수타입은 근사값이므로 카운트 변수로 쓰지 말아야함
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
}
