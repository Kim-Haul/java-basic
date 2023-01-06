import java.util.Arrays;
import java.util.List;

public class Practice5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");
        System.out.println(names.stream().filter(name -> name.startsWith("이")).count());
    }
}