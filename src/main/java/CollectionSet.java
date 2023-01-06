import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CollectionSet {
    public static void main(String[] args) {
        // 자료구조에 담기는 것은 사실은 객체이다 보니,
        // 컬렉션 프레임워크를 쓰기 위해서는 객체를 담을 수 있는 타입이여 함.
        // 측, 레퍼런스 타입 (참조형 자료) 여야 함.
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(9);
        integerSet.add(8);
        System.out.println(integerSet);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("NEW YORK");
        stringSet.add("LAS VEGAS");
        stringSet.add("SAN FRANCISCO");
        System.out.println(stringSet);

        stringSet.remove( "LAS VEGAS");
        System.out.println(stringSet);

        List<String> target = new ArrayList<>();
        target.add("NEW YORK");
        target.add("LA");
        stringSet.removeAll(target);
        System.out.println(stringSet);

        // true false return
        System.out.println("SAN FRANCISCO 가 포함되어 있나요? " + stringSet.contains("SAN FRANCISCO"));
        System.out.println(stringSet.size());
        stringSet.clear();
        System.out.println(stringSet);

    }
}
