package afternoon.lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();//차일드가 생성되면 부모인 패런트도 같이 생성되기 때문에 당연히 접근 가능

        System.out.println(child.toString());
        System.out.println(child);
        //println은 인스턴스 내부에 toString을 실행시키기 때문에
        //child는 묵시적으로 object를 상속받은 것과 다름 없기 때문에 가능


        String ref1 = Integer.toHexString(child.hashCode());
        //10진수 숫자를  16진수로 바꿔줌
        String ref2 = Integer.toHexString(System.identityHashCode(child));
        //S.i(인스턴스) => 위와 동일한 주소값 출력해줌

        System.out.println("ref1 = " + ref1);
        System.out.println("ref2 = " + ref2);

        // P와 C는 상속관계라서 하나의 배열에 담을 수 있음 단, OtherClass는 P의 자식이 아니라서 P타입의 배열에는 넣을 수 없음
        Parent[] objects = {new Parent(), new Child()};
        Object[] objects2 = {new Parent(), new Child(), new OtherClass()};
        // Object 타입의 배열에는 모든 넣을 수 있음

        System.out.println(size(objects));
        System.out.println(size(objects2));
    }

    //모든 배열을 매개변수로 받을 수 있어야하기 때문에 Object타입으로
    public static int size(Object[] objs) {
        return objs.length;
    }


}
