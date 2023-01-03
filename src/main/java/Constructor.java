class Tv {
    String model;
    String color;
    int price;

    // 생성자 (alt + insert)
    // constructor 를 만들어주지 않아도, 자바 컴퍼일러가 빈 생성자를 하나 만들어줘서 instance 생성이 가능.
    Tv (String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}

class DefaultValueTest {
    byte byteDefaultValue;
    int intDefaultValue;
    short shortDefaultValue;
    long longDefaultValue;
    float floatDefaultValue;
    double doubleDefaultValue;
    boolean booleanDefaultValue;
    String referenceDefaultValue;
}

public class Constructor {
    public static void main(String[] args) {
        // JAVA 에서 큰 따옴표 (" ")는 문자열을 입력 받을 때 사용,
        // 작은 따옴표 (' ')는 문자 하나를 입력 받을 때.
        Tv Samsung = new Tv("커브드 와이어", "black", 120);
        Tv Lg =new Tv("OLED", "white", 110);

        System.out.println("철수는 이번에 " + Samsung.model + " " + Samsung.color + " 색상을 " + Samsung.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + Lg.model + " " + Lg.color + " 색상을 " + Lg.price + "만원에 샀다.");

        // 생성자로 아무 값을 세팅안해주었을 때, instance 는 member 변수의 기본값을 가짐.
        DefaultValueTest defaultValueTest = new DefaultValueTest();
        System.out.println("byte default: " + defaultValueTest.byteDefaultValue);
        System.out.println("short default: " + defaultValueTest.shortDefaultValue);
        System.out.println("int default: " + defaultValueTest.intDefaultValue);
        System.out.println("long default: " + defaultValueTest.longDefaultValue);
        System.out.println("float default: " + defaultValueTest.floatDefaultValue);
        System.out.println("double default: " + defaultValueTest.doubleDefaultValue);
        System.out.println("boolean default: " + defaultValueTest.booleanDefaultValue);
        System.out.println("reference default: " + defaultValueTest.referenceDefaultValue);
    }
}


