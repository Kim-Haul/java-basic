import java.util.ArrayList;
        import java.util.Collection;
        import java.util.List;

// 제네릭스는 다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일시 타입을 체크해주는 기능.
// 객체의 타입을 컴파일 시에 체크하면 안정성이 높아짐. 의도치 않은 타입의 객체가 저장되는 것을 막고, 잘못된 형변환 방지.

// 구현체와 인터페이스에 대한 개념적인 차이. https://okky.kr/articles/992744
public class Generics {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("string");
        Collection<String> collection = list;

        List<Exception> exceptionList = new ArrayList<>();
        Collection<Exception> exceptionCollection = exceptionList;
        // exceptionCollection.addAll(list); compile error;

        List<IllegalAccessException> exceptions = new ArrayList<>();
        exceptionCollection.addAll(exceptions);
    }
}