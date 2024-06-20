package afternoon.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker volumeSetting = new Speaker();

        volumeSetting.volumeUp();
        volumeSetting.volumeDown();
        volumeSetting.volumeUp();
        volumeSetting.volumeUp();
        volumeSetting.volumeUp();
        volumeSetting.volumeUp();
        volumeSetting.mute();
        volumeSetting.volumeUp();
        volumeSetting.volumeUp();
        volumeSetting.mute();
        volumeSetting.volumeDown();

    }
}
