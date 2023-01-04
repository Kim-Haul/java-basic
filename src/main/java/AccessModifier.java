import pkg.ModifierTest;

class Child extends ModifierTest {
    void callParentProtected() {
        System.out.println("call my parent's protected method");
        super.messageProtected();
    }
}

public class AccessModifier {
    // 객체 지향 언어 특징 중 하나인 접근제어자
    // 접근 제어자는 멤버 변수/함수 혹은 클래스 앞에 붙어 사용되며 외부에서 접근을 제어하는 역할.
    // (좁음) private -> default -> protected -> public (넓음)
    // 객체 지향 프로그래밍에 있어서 캡슐화는 중요. 캡슐화의 도구로 접근 제어자를 사용. : 객체들간의 관계 표현

    // → private : 같은 클래스 내에서만 접근이 가능합니다
    // → default(nothing) : 같은 패키지 내에서만 접근이 가능합니다.
    // → protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능합니다.
    // → public : 접근 제한이 전혀 없습니다.
    public static void main(String[] args) {
        ModifierTest modifierTest = new ModifierTest();
        modifierTest.messageOutside();
    // modifierTest.messageInside(); compile err
    // modifierTest.messageProtected(); compile err
    // modifierTest.messagePackagePrivate(); compile err

        Child child = new Child();
        child.callParentProtected();
    }

}
