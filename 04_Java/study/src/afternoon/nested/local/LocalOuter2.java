package afternoon.nested.local;

public class LocalOuter2 {
    private String outerInstance = "outerInstance";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString";

        class LocalInner implements Print{
            String localInstance = "localInstance";

            @Override
            public void printLocal() {
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);
                System.out.println("methodParameter = " + methodParameter);
                System.out.println("localInstance = " + localInstance);
            }
        }
        LocalInner localInner = new LocalInner(); // 메소드 내에서 인스턴스화를 시켰음
        localInner.printLocal();
    }

    public static void main(String[] args) {
        LocalOuter2 localOuter = new LocalOuter2();
        localOuter.outerMethod("methodParameter");
        //아우터 메소드 안에 프린트로컬이 있기 때문에 아우터메소드만 실행시켜도 다 출력됨
    }
}
