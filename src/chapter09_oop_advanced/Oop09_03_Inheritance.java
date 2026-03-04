package chapter09_oop_advanced;

/*
 * ===============================
 * 3) 상속 (Inheritance)
 * ===============================
 *
 * 부모 클래스의 필드와 메서드를
 * 자식 클래스가 물려받는 것
 */

class Animal {

    String name;

    void eat() {
        System.out.println(name + "가 밥을 먹는다.");
    }
}

/*
 * Dog 클래스는 Animal을 상속받는다
 */

class Dog extends Animal {

    void bark() {
        System.out.println(name + "가 짖는다.");
    }
}

class Cat extends Animal {
    void cries() {
        System.out.println(name + "가 운다.");
    }
}

public class Oop09_03_Inheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // 부모 필드 사용 가능
        dog.name = "멍멍이";

        // 부모 메서드 사용
        dog.eat();

        // 자식 메서드
        dog.bark();

        Cat cat = new Cat();

        cat.name = "야옹이";

        cat.eat();

        cat.cries();

    }
}