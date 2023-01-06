// 스트림이란, 데이터의 흐름.
// 어떤 collection 에 .stream 을 하면 스트림을 만들 수 있음.

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Sale {
    String fruitName;
    int price;
    float discount;

    public Sale(String fruitName, int price, float discount) {
        this.fruitName = fruitName;
        this.price = price;
        this.discount = discount;
    }
}

public class Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("대구");
        list.add("서울");
        System.out.println(list);

        // 리스트를 새로운 리스트로 .
        System.out.println("---- list -> transformation -> new list ----");
        List<String> result = list.stream().limit(2).collect(Collectors.toList());
        System.out.println(result);
        System.out.println("---- list -> transformation -> set ----");
        // 리스트를 Set 으로
        Set<String> set = list.stream().filter(it -> "서울".equals(it)).collect(Collectors.toSet());
        System.out.println(set);

        // 스트링 배열을 스트링으로
        System.out.println("---- String arr -> transformation -> String ----");
        String[] arr = {"SQL", "Java", "Python"};
        java.util.stream.Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(System.out::println);

        // 과일의 리스트를 만들기
        List<Sale> sales = Arrays.asList(
                new Sale("Apple", 5000, 0.05f),
                new Sale("Orange", 4000, 0.2f),
                new Sale("Grape", 2000, 0)
        );
        sales.stream().map(sale -> Pair.of(sale.fruitName, sale.price * (1 - sale.discount)))
                .forEach(pair -> System.out.println(pair.getLeft() + " 실구매가: " + pair.getRight() + "원 입니다."));

        // stream 에서 가장 많이 쓰는 패턴 중 하나 reduce
        List<Integer> listReduce = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(listReduce.stream().reduce(0, Integer::sum));
    }
}