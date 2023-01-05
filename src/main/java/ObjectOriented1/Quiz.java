package ObjectOriented1;

abstract class Person {
    String name;
    int age, speed;
    int x = 0;
    int y = 0;

    // 생성자 (alt + insert)
    // constructor 를 만들어주지 않아도, 자바 컴퍼일러가 빈 생성자를 하나 만들어줘서 instance 생성이 가능.
    Person (String name, int age, int x, int y, int speed) {
        this.name = name;
        this.age = age;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    abstract boolean walkable();
    abstract boolean runnable();
    abstract boolean swimming();

    // 걷기
    void walk(int x, int y) {
        if (walkable()) {
            System.out.println(name + "이(가) 걷습니다.");
            this.x = x;
            this.y = y;
            printLocation();
        }
    }

    // 뛰기
    void run(int x, int y) {
        if (runnable()) {
            System.out.println(name + "이(가) 뜁니다.");
            this.x = x;
            this.y = y;
            printLocation();
        } else {
            System.out.println(name + "은 뛸 수 없습니다.");
        }
    }

    // 수영
    void swim(int x, int y) {
        if (swimming()) {
            System.out.println(name + "이(가) 수영을 합니다.");
            this.x = x;
            this.y = y;
            printLocation();
        } else {
            System.out.println(name + "은 수영할 수 없습니다.");
        }
    }

    // 현재 좌표 찍기
    void printLocation() {
        System.out.println(name + "의 현재위치 : (" + x + ", " + y + ")");
    }

    // 최초 info 확인
    void printInfo() {
        System.out.println(name + "은(는) " + age + "살이며, " + "현재 위치는 (" + x + ", " + y + ")이고, 속도는 " + speed + " 입니다");
    }
}

class Child extends Person {
    Child(String name, int age, int x, int y, int speed) {
        super(name, age, x, y, speed);
    }

    @Override
    boolean walkable() {
        return true;
    }

    @Override
    boolean runnable() {
        return true;
    }

    @Override
    boolean swimming() {
        return true;
    }
}

class Parent extends Person {
    Parent(String name, int age, int x, int y, int speed) {
        super(name, age, x, y, speed);
    }

    @Override
    boolean walkable() {
        return true;
    }

    @Override
    boolean runnable() {
        return true;
    }

    @Override
    boolean swimming() {
        return false;
    }
}

class GrandParents extends Person {
    GrandParents(String name, int age, int x, int y, int speed) {
        super(name, age, x, y, speed);
    }

    @Override
    boolean walkable() {
        return true;
    }

    @Override
    boolean runnable() {
        return false;
    }

    @Override
    boolean swimming() {
        return false;
    }
}

public class Quiz {
    public static void main(String[] args) {
        Person child = new Child("[자식] 고민지", 27,0,0, 5);
        Person parent = new Parent("[부모] 박수범",31,0,0, 2);
        Person grandParents = new GrandParents("[조부모] 전종서", 35,0,0, 1);
        child.printInfo();
        parent.printInfo();
        grandParents.printInfo();
        child.walk(1, 1);
        parent.walk(1, 1);
        grandParents.walk(1, 1);
        child.run(2,2);
        parent.run(2, 2);
        grandParents.run(2, 2);
        child.swim(3, -1);
        parent.swim(3, -1);
        grandParents.swim(3, -1);
    }
}
