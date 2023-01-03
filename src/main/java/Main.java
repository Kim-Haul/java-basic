public class Main {
    public static void main(String[] args) {
        // write your code here
        int number = 5;
        String greet = "Hello world!";
        final int finalNumber = 1;

        // 기본 자료형은 크게 숫자, 문자, 논리, 바이트
        short a = 1; // 2바이트
        int b = 3; // 4바이트
        long c = 4; // 8바이트

        float f = 5.5F;
        double d = 5.5;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        // [FE] vs-code 에서 [한줄 복사]는 ctrl + shift + 방향키, [코드 위치 변경]은 alt + 방향키
        // [BE] intelliJ 에서 [한줄 복사]는 ctrl + D, [코드 위치 변경]은 alt + shift + 방향키
    }
}