package afternoon.nested.Inner;

public class Outer {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

    // static 빠짐으로써 외부 인스턴스를 기억할 수 있게됨
    class Inner {
        private static String nestedStatic = "nestedStatic";
        private String nestedInstance = "nestedInstance";

        public void print() {
            // 클래스 내부의 static에 접근
            System.out.println("nestedStatic = " + nestedStatic);
            System.out.println("outerStatic = " + outerStatic);

            // 클래스 내부의 non-static(인스턴스) 에 접근
            System.out.println("nestedInstance = " + nestedInstance);
            System.out.println("outerStatic = " + outerInstance);
            // static 빼니까 바깥에 있던 클래스의 인스턴스 멤버에 접근 가능해짐
            // 직접 포함하는 것은 아니고 실제로는 이너가 아우터의 참조값을 보관하기 때문에 가능
        }
    }
}

