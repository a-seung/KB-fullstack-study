package morning.study.src.ch11.sec04;

public class MyResource implements AutoCloseable {
    private String name;

    //생성자
    public MyResource(String name) {
        this.name = name;
        System.out.println("[MyResource(" + name + ") 열기]");
    }

    //메서드
    public String read1() {
        System.out.println("[MyResource(" + name + ") 읽기]");
        return "100";
    }

    //메서드
    public String read2() {
        System.out.println("[MyResource(" + name + ") 읽기]");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[MyResource(" + name + ") 닫기]");
    }
}
