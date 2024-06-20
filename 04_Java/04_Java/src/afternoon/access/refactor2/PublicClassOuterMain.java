package afternoon.access.refactor2;

import afternoon.access.refactor.PublicClass;
//import afternoon.access.refactor.DefaultClass1;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
//        DefaultClass1 dc1 = new DefaultClass1();
    }
}



//이걸 해본 이유는 필드값에 접근제어자를 사용하는데, 클래스에도 할 수 있다는 의미 ?????
//클래스에도 적용가능한데 p/d 만 가능함