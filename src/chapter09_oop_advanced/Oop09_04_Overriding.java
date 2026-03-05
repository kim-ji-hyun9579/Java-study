package chapter09_oop_advanced;

/*
 * ===============================
 * 4) 오버라이딩 (Overriding)
 * ===============================
 *
 * 부모 클래스의 메서드를
 * 자식 클래스에서 재정의하는 것
 */

class Animal2 {

    void eat() {
        System.out.println("동물이 먹이를 먹는다.");
    }
}

class Dog2 extends Animal2 {

    // 부모 메서드를 재정의
    @Override
    void eat() {
        System.out.println("개가 사료를 먹는다.");
    }
}

class Cat2 extends Animal2 {

    @Override
    void eat() {
        System.out.println("고양이가 생선을 먹는다.");
    }
}

public class Oop09_04_Overriding {

    public static void main(String[] args) {

        Dog2 dog = new Dog2();
        dog.eat();

        Cat2 cat = new Cat2();
        cat.eat();
    }
}