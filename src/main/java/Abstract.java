// 추상클래스란 추상메소드를 선언날 수 있는 클래스 의미.
// 클래스와는 다르게, 상속받는 자식 클래스 없이 인스턴스 생성 불가.
abstract class Bird {
    private  int x,y, z;
    void fly(int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        if(flyable(z)) {
            this.z = z;
        } else {
            System.out.println("그 높이로는 날 수 없습니다.");
        }
        printLocation();
    }
    // 추상메소드
    // 구현체가 없음. 자식 클래스에서 구현해야.
    abstract boolean flyable(int z);
    public void printLocation() {
        System.out.println("현재위치 : (" + x + ", " + y + ", " + z + ")");
    }
}

class Pigeon extends Bird {
    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}

class Peacock extends Bird {
    @Override
    boolean flyable(int z) {
        return false;
    }
}

public class Abstract {
    public static void main(String[] args) {
        // 추상클래스는 그 자체로 인스턴스를 생성 할 수 없음.
        // Bird bird = new Bird();
        Bird pigeon = new Pigeon();
        Bird peacock = new Peacock();
        System.out.println("--- 비둘기 ---");
        pigeon.fly(1, 1, 3);
        System.out.println("--- 공작새 ---");
        peacock.fly(1, 1, 3);
        System.out.println("--- 비둘기 ---");
        pigeon.fly(3, 3, 30000);
    }
}
