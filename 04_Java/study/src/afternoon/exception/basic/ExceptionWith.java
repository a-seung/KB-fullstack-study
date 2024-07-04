package afternoon.exception.basic;

//예외 처리가 있는 ver
public class ExceptionWith {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            accessArr(arr, 5);
            System.out.println("예외가 발생하지 않았습니다.");
            System.out.println("원하는 작업을 이어갑니다.");

            Object obj = null;

            accessNull(obj);
            System.out.println("객체가 null이 아닙니다.");
            System.out.println("원하던 작업을 이어갑니다!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean accessArr(int[] arr, int idx) {
        if (idx < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean accessNull(Object obj) {
        // 어떤 값이든 처리할 수 있도록 모든 객체의 부모인 Object타입으로 넣었음
        if (obj == null) {
            return true;
        } else {
            return false;
        }
    }
}
