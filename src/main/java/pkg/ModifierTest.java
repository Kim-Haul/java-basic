package pkg;

    // 자바는 클래스를 인식할때 패키지 이름까지 붙여서 인식.
    // 즉, pkg2 패키지가 있다고 가정할 때, 이 곳의 pkg.ModifierTest 와 pkg2.ModifierTest 는 다른 클래스.
public class ModifierTest {
    private void messageInside() {
        System.out.println("This is private modifier");
    }

    public void messageOutside() {
        System.out.println("This is public modifier");
        messageInside();
    }

    protected void messageProtected() {
        System.out.println("This is protected modifier");
    }

    void messagePackagePrivate() {
        System.out.println("This is package private modifier");
    }
}
