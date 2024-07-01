package afternoon.lang.wrapper;

public class PerformanceMain {
    public static void main(String[] args) {
        int max = 1_000_000_000;
        long startTime, endTime;

        //원시형 작업 시간
        long sum1 = 0;
        startTime = System.currentTimeMillis();
        //현재시간을 밀리세컨드단위로 저장해줌
        for (int i = 0; i < max; i++) {
            sum1 += i;
        }
        endTime = System.currentTimeMillis();
        long spentTime = endTime - startTime;
        System.out.println("for문 작업에 걸린 시간 : " + spentTime + " ms");


        //래퍼클래스 작업 시간
        Long sum2 = 0L;
        startTime = System.currentTimeMillis();
        //현재시간을 밀리세컨드단위로 저장해줌
        for (int i = 0; i < max; i++) {
            sum2 += i;
        }
        endTime = System.currentTimeMillis();
        long spentTime2 = endTime - startTime;
        System.out.println("for문 작업에 걸린 시간 : " + spentTime2 + " ms");
    }
}
