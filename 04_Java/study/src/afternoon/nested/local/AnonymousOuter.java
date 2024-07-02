package afternoon.nested.local;

public class AnonymousOuter {
    private String outerInstance = "outerInstance";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString";

        Print print = new Print(){
            String localInstance = "localInstance";

            @Override
            public void printLocal() {
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);
                System.out.println("methodParameter = " + methodParameter);
                System.out.println("localInstance = " + localInstance);
            }
        };

       print.printLocal();
    }

    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.outerMethod("methodParameter");
        //아우터 메소드 안에 프린트로컬이 있기 때문에 아우터메소드만 실행시켜도 다 출력됨
    }
}
