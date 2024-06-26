package afternoon.access;

public class Speaker {
    private int volume; // 외부에서 접근 불가능 해야함

    // 생성자 생성
    public Speaker() {
        this.volume = 20;
    }

    // 볼륨 증가
    public void volumeUp() {
        if (0 <= volume && volume < 100) {
            this.volume += 1;
            getVolume();
        } else {
            notAllowed();
        }
    }

    // 볼륨 감소
    public void volumeDown() {
        if (0 < volume && volume <= 100) {
            this.volume -= 1;
            getVolume();
        } else {
            notAllowed();
        }
    }

    // 무음 만들기
    public void mute() {
        this.volume = 0;
        getVolume();
        System.out.println("스피커가 Mute 되었습니다.");
    }

    // 볼륨 확인 문구
    public void getVolume() {
        System.out.println("현재 볼륨은 : " + this.volume + "입니다.");
    }

    // 조절 불가 문구
    public void notAllowed() {
        System.out.println("더 이상 볼륨 조절이 불가능합니다.");
    }
}
