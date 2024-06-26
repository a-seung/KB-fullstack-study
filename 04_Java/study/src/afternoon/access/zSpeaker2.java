package afternoon.access;

public class zSpeaker2 {
    private int volume; // 외부에서 접근 불가능 해야함
    private int MAX_VOLUME = 100;
    private int MIN_VOLUME = 0;

    // 생성자 생성
    public zSpeaker2() {
        this.volume = 20;
    }

    public void volumeUp() {
        if (this.volume < MAX_VOLUME) {
            this.volume++;
        } else {
            printLimit();
        }
    }

    public void volumeDown() {
        if (this.volume > MIN_VOLUME) {
            this.volume--;
        } else {
            printLimit();
        }
    }

    public void mute() {
        this.volume = 0;
        System.out.println("스피커가 Mute 되었습니다.");
    }

    private void printLimit() {
        System.out.println("더 이상 볼륨 조절이 불가능합니다!");
    }

}
