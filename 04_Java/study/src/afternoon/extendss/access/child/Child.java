package afternoon.extendss.access.child;

import afternoon.extendss.access.parent.Parent;
//패키지 위치가 서로 다르기 때문에 임포트 된 것임

public class Child extends Parent {
    public void access() {

        System.out.println("publicValue : " + publicValue); // 어디서든 접근 가능
        System.out.println("protectedValue : " + protectedValue); // 패키지는 다르지만 상속관계라서 접근가능
//        System.out.println("defaultValue : " + defaultValue); // 패키지가 달라서 불가능
//        System.out.println("privateValue : " + privateValue); // 같은 클래스가 아나므로 불가능

        //메서드에 접근해보기
        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        System.out.println();
        printParent();
    }
}
