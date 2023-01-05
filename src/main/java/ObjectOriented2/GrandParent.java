package ObjectOriented2;

public class GrandParent extends Human implements Walkable{
    // 생성자
    public GrandParent(String name, int age) {
        super(name, age, 1);
    }

    @Override
    public void walk(int x, int y) {
        printWhoAmI();
        System.out.println("walk speed: " + speed);
        this.x = x;
        this.y = y;
        System.out.println("walked to " + getLocation());
    }
}
