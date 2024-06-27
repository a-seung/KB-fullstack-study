package afternoon.memory;

public class Counter {
    public static int counter = 0;

    Counter(){
        counter++;
        //static덕분에 유일한 counter가 되었기 때문에 this필요없음

    }
}
