package chapter10_abstraction;

/*
 * ===============================
 * 1) 추상 클래스 (Abstract Class)
 * ===============================
 *
 * 추상 클래스 특징
 *
 * 1. abstract 키워드 사용
 * 2. 객체 생성 불가능
 * 3. 추상 메서드를 가질 수 있음
 * 4. 일반 메서드도 가질 수 있음
 * 5. 상속받은 자식 클래스가 반드시 구현해야 함 (Override)
 */

// 추상 클래스
abstract class Animal {

    // 일반 필드
    String name;

    // 일반 메서드
    void eat() {
        System.out.println(name + "이(가) 먹이를 먹는다.");
    }

    // 추상 메서드 (구현 없음)
    abstract void sound();
}

// 자식 클래스
class Dog extends Animal {

    // 추상 메서드 구현 (필수)
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("야옹!");
    }
}

public class Oop10_01_AbstractClass {

    public static void main(String[] args) {

        // Animal a = new Animal();  불가능 (추상 클래스)

        Dog dog = new Dog();
        dog.name = "강아지";
        dog.eat();
        dog.sound();

        System.out.println("------");

        Cat cat = new Cat();
        cat.name = "고양이";
        cat.eat();
        cat.sound();
    }
}