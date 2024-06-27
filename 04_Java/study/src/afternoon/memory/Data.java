package afternoon.memory;

public class Data {
    public int value;
    //초기화 안하는 이유는 생성자가 있다는 의미
    Data(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
