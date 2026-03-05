package chapter09_oop_advanced;

/*
 * ===============================
 * 5) 다형성 (Polymorphism)
 * ===============================
 *
 * 핵심 1) 부모 타입 변수로 자식 객체를 담을 수 있다.
 *    Animal3 a = new Dog3();
 *
 * 핵심 2) "실행되는 메서드"는 변수 타입(Animal3)이 아니라
 *        "실제 객체(Dog3, Cat3)" 기준으로 결정된다.  -> 오버라이딩 + 동적 바인딩
 *
 * 핵심 3) 단, 부모 타입(Animal3)으로 잡으면
 *        자식에만 있는 메서드(bark 등)는 바로 못 부른다.
 *        필요하면 형변환(다운캐스팅)을 해야 한다.
 */

class Animal3 {

    // 공통 기능(부모가 가진 기능)
    void eat() {
        System.out.println("Animal3: 동물이 먹이를 먹는다.");
    }
}

class Dog3 extends Animal3 {

    // 오버라이딩: 부모 메서드를 자식 버전으로 재정의
    @Override
    void eat() {
        System.out.println("Dog3: 개가 사료를 먹는다.");
    }

    // 자식만 가진 기능
    void bark() {
        System.out.println("Dog3: 멍멍!");
    }
}

class Cat3 extends Animal3 {

    @Override
    void eat() {
        System.out.println("Cat3: 고양이가 생선을 먹는다.");
    }

    void meow() {
        System.out.println("Cat3: 야옹!");
    }
}

public class Oop09_05_Polymorphism {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1) 업캐스팅 (Upcasting)
         * ===============================
         * 부모 타입 변수(Animal3)에 자식 객체(Dog3)를 담는 것
         *
         * - 자동 형변환(묵시적) 된다.
         * - 매우 흔하게 쓰인다.
         */

        Animal3 a1 = new Dog3();
        Animal3 a2 = new Cat3();

        /*
         * ===============================
         * 2) 오버라이딩 + 다형성의 핵심
         * ===============================
         * 변수 타입은 Animal3 이지만,
         * 실제 객체가 Dog3면 Dog3.eat()이 실행된다.
         */

        a1.eat(); // Dog3: 개가 사료를 먹는다.
        a2.eat(); // Cat3: 고양이가 생선을 먹는다.

        System.out.println("------");

        /*
         * ===============================
         * 3) 부모 타입으로는 자식 전용 메서드 호출 불가
         * ===============================
         */

        // a1.bark(); // 컴파일 에러: Animal3 타입에는 bark()가 없음
        // a2.meow(); // 컴파일 에러

        /*
         * ===============================
         * 4) 다운캐스팅 (Downcasting)
         * ===============================
         * 자식 전용 기능을 꼭 써야 한다면 형변환 필요
         * 단, "진짜 Dog3 객체일 때만" 가능
         */

        Dog3 realDog = (Dog3) a1; // a1 안에 Dog3가 들어있으므로 OK
        realDog.bark();

        System.out.println("------");

        /*
         * ===============================
         * 5) instanceof로 안전하게 다운캐스팅
         * ===============================
         * a1이 Dog3인지 확인하고 캐스팅
         */

        if (a2 instanceof Dog3) {
            Dog3 d = (Dog3) a2;
            d.bark();
        } else {
            System.out.println("a2는 Dog3가 아니라서 bark() 못함");
        }

        System.out.println("------");

        /*
         * ===============================
         * 6) 다형성의 진짜 힘: 배열/반복문 처리
         * ===============================
         * Animal3 하나의 타입으로 여러 자식을 관리
         */

        Animal3[] animals = { new Dog3(), new Cat3(), new Dog3() };

        for (Animal3 a : animals) {
            a.eat(); // 각 객체에 맞는 eat()이 실행됨 (Dog3 or Cat3)
        }
    }
}