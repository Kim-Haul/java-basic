public class PrimitiveType {
    public static void main(String[] args) {
        // write your code here
        int number = 5;
        final int finalNumber = 1;

        // 기본 자료형은 크게 숫자, 문자, 논리, 바이트
        short s = 1; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        float f = 5.5F;
        double d = 5.5;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        // [FE] vs-code 에서 [한줄 복사]는 ctrl + shift + 방향키, [코드 위치 변경]은 alt + 방향키
        // [BE] intelliJ 에서 [한줄 복사]는 ctrl + D, [코드 위치 변경]은 alt + shift + 방향키
        
        // ctrl + alt + l 자동정렬

        char c = 'A'; // 문자
        boolean fact = true;
        byte data = 'd';
        System.out.println(c);
        System.out.println(fact);
        System.out.println(data);
    }
}