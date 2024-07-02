package afternoon.nested.nested;

public class Outer {
    private static String outerStatic= "outerStatic";
    private String outerInstance = "outerInstance";

    static class Nested {
        private static String nestedStatic = "nestedStatic";
        private String nestedInstance = "nestedInstance";

        public void print() {
            // 클래스 내부의 static에 접근
            System.out.println("nestedStatic = " + nestedStatic);
            System.out.println("outerStatic = " + outerStatic);

            // 클래스 내부의 non-static(인스턴스) 에 접근
            System.out.println("nestedInstance = " + nestedInstance);
//            System.out.println("outerStatic = " + outerInstance);
            //외부에 있는 인스턴스 값에는 접근이 불가능 함
            // 상속관계가 아니라서 접근 불가
        }
    }
}

