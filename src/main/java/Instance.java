//붕어빵 틀 (클래스)
class Phone {
    String model;
    String color;
    int price;
}

public class Instance {
    public static void main(String[] args) {
        // 실제 붕어빵 하나하나 (인스턴스)
        Phone galaxy = new Phone();
        galaxy.model = "Galaxy10";
        galaxy.color = "Black";
        galaxy.price = 100;

        // 실제 붕어빵 하나하나 (인스턴스)
        Phone iphone = new Phone();
        iphone.model = "iPhoneX";
        iphone.color = "Black";
        iphone.price = 200;


        System.out.println("철수는 이번에 " + galaxy.model + " " + galaxy.color + " 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + " " + iphone.color + " 색상을 " + iphone.price + "만원에 샀다.");

        // 자료형 [] 변수 = { 데이터1 , 데이터2 ... }
        // 자료형 [] 변수 = new 자료형 [배열크기]
        int[] heights = new int[]{10, 20, 30, 40, 50};

    }

    int add(int x, int y) {
        return x + y;
    }
}