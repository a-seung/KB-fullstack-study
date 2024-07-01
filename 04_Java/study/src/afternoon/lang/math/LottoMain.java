package afternoon.lang.math;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        lottoGenerator.generate();
        lottoGenerator.printLottoNumbers();
    }
}
