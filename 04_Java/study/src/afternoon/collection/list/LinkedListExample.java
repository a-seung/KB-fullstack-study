package afternoon.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //앞에 제네릭<>에 이미 선언했기 때문에 뒤에서는 하지 않아도됨
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        // ArrayList 보다 LinkedList 가 제일 유리한 케이스
        list.addFirst(0);
        
        // 둘이 동일한 케이스
        list.addLast(6);
        
        list.add(3,22);

        System.out.println("list = " + list);

        // 검색(자바에서는 첫번째, 마지막 값을 알고 있기 때문에 얼마 안 걸림)
        int firstElement = list.getFirst();
        int lastElement = list.getLast();
        int midElement = list.get(4);
    }
}
