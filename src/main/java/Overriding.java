class Fruit {
    String name;
    String color;

    // 생성자
    public Fruit(String name) {
        this.name = name;
    }
    public void taste() {
        System.out.println(name + " is delicious");
    }
}

class Apple extends Fruit {
    // 생성자
    public Apple(String name) {
        super(name);
    }

    // 부모 클래스에서 상속 받은 메소드를 overriding
    @Override
    public void taste() {
        System.out.println(name + " is not delicious");
    }
}

public class Overriding {
    public static void main(String[] args) {
        // write your code here
        Fruit apple = new Apple("백설공주가 먹은 사과");
        apple.taste();
    }
}
