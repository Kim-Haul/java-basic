import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크란 다수의 데이터를 다루 위한 자료구조를 표현하고 사용하는 클래스의 집합.
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(4);
        integerList.add(11);
        integerList.add(10);

        System.out.println(integerList);
        Collections.sort(integerList); // default : 오름차순
        System.out.println(integerList);
        System.out.println(integerList.size());

        integerList.remove(4);
        System.out.println(integerList);

        for(int i = 0; i < integerList.size(); i ++) {
            System.out.println(integerList.get(i));
        }

        for(int current: integerList) {
            System.out.println(current);
        }
    }
}
