interface Flyable {
    // 인터페이스는 필드를 가지지 못하고, method 만 정의. 실제 구현체는 implements 키워드를 통해.
    // 인터페이스는 구현하는 객체의 동작에 명세. 클래스와 달리 다중 상속 가능.
    void fly(int x, int y, int z);
}

class Eagle implements Flyable {
    private int x, y, z;

    @Override
    public void fly(int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }

    public void printLocation() {
        System.out.println("현재위치 : (" + x + ", " + y + ", " + z + ")");
    }
}

public class Interface {
    public static void main(String[] args) {
        Flyable eagle = new Eagle();
        eagle.fly(1, 2, 3);
    }
}
