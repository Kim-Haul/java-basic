import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args) {
        // write your code here
        // 기본 자료형이 아닌 모든 것을 참조 자료형이라 칭함.
        // 참조 자료형은 JAVA 의 인스턴스, 즉 객체를 가르킬 수 있는 자료형.
        String greet = "Hello world!";
        System.out.println(greet);

        int[] intArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));

        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        String[] strongEmptyArray = new String[5];
        System.out.println(Arrays.toString(strongEmptyArray));

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        // 배열의 마지막 값 출력
        // JS 와는 다르게 undefined 가 없음. 에러가 남.
        System.out.println(season[season.length - 1]);
    }
}