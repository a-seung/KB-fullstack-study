package ch02.Q02;

public class Q02_L1_02 {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");

        int totalMinute = 60 * hour + minute;
        System.out.println("총 " + totalMinute + "분");
    }
}
