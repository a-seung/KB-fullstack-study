package afternoon.access.refactor;

// public class는 반드시 하나여야함
// 파일명과 public class 이름은 동일해야함


public class PublicClass {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        DefaultClass1 dc1 = new DefaultClass1();
        DefaultClass2 dc2 = new DefaultClass2();
    }
}

class DefaultClass1 {}

class DefaultClass2 {}
