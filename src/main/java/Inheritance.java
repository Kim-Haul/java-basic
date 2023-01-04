class Animal {
    String name;

    // public : 접근 제한자. 단어 뜻 그대로, 외부 클래스가 자유롭게 사용할 수 있도록 함.
    public void cry() {
        System.out.println(name + " is crying.");
    }
}

class Dog extends Animal {
    // constructor (생성자) 정의
    Dog(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("코코");
        dog.cry();
        dog.swim();

        Animal dog2 = dog;
        Animal dog3 = new Dog("미미");
        dog2.cry();
        dog3.cry();
        // dog3.swim(); compile error;
        // dog3의 실제 객체는 Dog 지만, 실제 변수를 선언하는 type 는 Animal 로 되어 있기에 Animal 에 있는 기능만 수행 가능.
    }
}
