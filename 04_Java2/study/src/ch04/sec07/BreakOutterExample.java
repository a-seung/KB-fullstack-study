package ch04.sec07;

public class BreakOutterExample {
    public static void main(String[] args) throws Exception {
        // 큰 for문에 라벨명:을 붙이고 작은 for문에서 break 라벨명 하면 큰 for문까지 종료됨
        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
