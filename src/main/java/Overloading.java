public class Overloading {
    public static void main(String[] args) {
        // write your code here

    }

    int add(int x, int y, int z) {
        return x + y + z;
    }
    // 메소드의 이름 같은 경우, 매개 변수의 개수 || 매개변수의 타입이 달라야 함.
    // return 타입만 다른 경우는 overloading 이 아님.
    long add(int a, int b, long c) {
        return a + b + c;
    }
}
