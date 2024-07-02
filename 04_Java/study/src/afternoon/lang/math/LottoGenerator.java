package afternoon.lang.math;

import java.util.Random;

public class LottoGenerator {
    int[] lottoNumbers = new int[6];
    Random rand = new Random();

    public void generate() {
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = rand.nextInt(45);
        }
    }

    public void printLottoNumbers() {
        System.out.print("로또번호 : ");
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }
    }
}
