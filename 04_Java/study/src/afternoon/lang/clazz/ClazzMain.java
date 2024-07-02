package afternoon.lang.clazz;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Field;

public class ClazzMain {
    public static void main(String[] args) throws Exception {
        //ClassNotFoundException => 없을 때 예외처리 // exception으로 묶어서 관리해도 됨
        Class clazz1 = User.class; // 1.클래스에서 직접 조회
        Class clazz2 = new User("이승아").getClass(); // 2.인스턴스를 만들어서 조회
        Class clazz3 = Class.forName("afternoon.lang.clazz.User");
        
        // 모든 필드(멤버 변수)
        Field[] fields = clazz1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        // 상위 클래스 정보 출력
        System.out.println("상위 클래스 = " + clazz1.getSuperclass());

        // 상위 인터페이스 정보 출력
        Class[] interfaces= clazz1.getInterfaces();
        //클래스는 다중 상속 안되고 인터페이스는 다중구현 가능하기 때문
        for(Class i: interfaces){
            System.out.println("상위 인터페이스 = " + i); // 없으니까 빈화면 뜸
        }

        // Class 정보를 바탕으로 인스턴스 만들기
        User user = (User) clazz1.getDeclaredConstructor().newInstance();
//        User user2 = new User("승아");
        System.out.println("user = " + user);
    }
}
