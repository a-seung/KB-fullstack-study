package afternoon.extendss.access.parent;

public class Parent {

    //접근 제어자는 필드값,메서드,클래스에 적용할 수 있움
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }


    //퍼블릭 형태로 메서드를 만들어주면 외부에서 확인할 수 있음
    public void printParent() {
        System.out.println("publicValue: " + publicValue);
        System.out.println("protectedValue: " + protectedValue);
        System.out.println("defaultValue: " + defaultValue);
        System.out.println("privateValue: " + privateValue);

        // 동일 클래스이기 때문에 모두 접근 가능
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }


}
