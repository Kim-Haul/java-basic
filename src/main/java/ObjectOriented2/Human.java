package ObjectOriented2;

public class Human {
    public Object run;
    String name;
    int age;
    int speed;
    int x, y;

    // 생성자 생성
    public Human(String name, int age, int speed, int x, int y) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    // 위쪽 생성자 당겨씀
    public Human(String name, int age, int speed) {
        this(name, age, speed, 0, 0);
    }

    public String getLocation() {
        return "(" + x + ", " + y + ")";
    }

    protected void printWhoAmI() {
        System.out.println("My name is " + name + ". " + age + " aged.");
    }

}


