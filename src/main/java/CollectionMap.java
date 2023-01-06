import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "berry");
        map.put(3, "cherry");
        System.out.println(map);

        // map 에서는 get 함수에 key 를 받아서 value 를 리턴
        System.out.println("1st in map: " + map.get(1));
        map.remove(2);
        System.out.println(map);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("cherry"));
        map.clear();
    }

}