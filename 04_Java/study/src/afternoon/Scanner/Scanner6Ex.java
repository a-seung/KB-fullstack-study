package afternoon.Scanner;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ranNum = (int) (Math.random() * 100);

        while (true) {
            System.out.println("랜덤 숫자를 입력하세요 : ");
            int input = sc.nextInt();
            if (input == ranNum) {
                System.out.println("정답입니다! 랜덤 숫자는 " + ranNum);
                break;
            }
            else if (input > ranNum ) {
                System.out.println("Down");
            }
            else {
                System.out.println("Up");
            }

        }
    }
}
