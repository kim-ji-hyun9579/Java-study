package chapter16_object_string;

public class Object01_ObjectIntro {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. Object 클래스란?
         * ======================================
         *
         * Object 클래스는 자바의 최상위 부모 클래스이다.
         *
         * 자바에서 만드는 모든 클래스는
         * 명시적으로 적지 않아도 자동으로 Object를 상속받는다.
         *
         * 예:
         *
         * class Person { }
         *
         * 이 코드는 실제 개념상으로는 아래와 비슷하다.
         *
         * class Person extends Object { }
         *
         * 즉,
         * Person, Student, Car, Book 같은 모든 클래스는
         * 결국 Object의 자식 클래스이다.
         */

        /*
         * ======================================
         * 2. 객체 생성
         * ======================================
         */

        Person person = new Person();
        Student student = new Student();

        /*
         * ======================================
         * 3. 객체를 출력하면 무슨 일이 일어날까?
         * ======================================
         *
         * 객체를 그냥 출력하면
         * 내부적으로 toString() 메서드가 호출된다.
         *
         * 지금은 Person, Student 클래스에서
         * toString()을 오버라이딩하지 않았기 때문에
         * Object 클래스의 기본 toString() 결과가 출력된다.
         */

        System.out.println(person);
        System.out.println(student);

        /*
         * ======================================
         * 4. 모든 객체는 Object 타입으로 받을 수 있다
         * ======================================
         *
         * 자식 객체를 부모 타입 변수에 담는 것을
         * 업캐스팅이라고 한다.
         *
         * Object는 모든 클래스의 부모이므로
         * 어떤 객체든 Object 타입 변수에 담을 수 있다.
         */

        Object obj1 = person;
        Object obj2 = student;

        System.out.println(obj1);
        System.out.println(obj2);

        /*
         * ======================================
         * 5. 클래스 타입 비교
         * ======================================
         *
         * person 변수의 타입은 Person
         * obj1 변수의 타입은 Object
         *
         * 하지만 실제 들어있는 객체는 같은 Person 객체이다.
         */

        System.out.println(person == obj1); // true
        System.out.println(student == obj2); // true

        /*
         * ======================================
         * 6. 왜 Object가 중요할까?
         * ======================================
         *
         * 우리가 앞으로 배울
         *
         * toString()
         * equals()
         * hashCode()
         *
         * 이 메서드들은 모두 Object 클래스에 들어 있다.
         *
         * 즉,
         * 모든 객체가 이 메서드들을 기본적으로 가지고 있다는 뜻이다.
         */

        /*
         * ======================================
         * 7. getClass()도 Object의 메서드
         * ======================================
         *
         * getClass()는 현재 객체의 클래스 정보를 알려준다.
         * 이것도 Object 클래스의 메서드이다.
         */

        System.out.println(person.getClass());
        System.out.println(student.getClass());

        /*
         * ======================================
         * 8. Object 클래스 요약
         * ======================================
         *
         * - Object는 자바의 최상위 부모 클래스
         * - 모든 클래스는 Object를 자동 상속
         * - 모든 객체는 Object 타입으로 다룰 수 있음
         * - toString(), equals(), hashCode(), getClass() 등을 제공
         *
         * 앞으로 Object를 이해해야
         * 객체 비교, 객체 출력, 컬렉션 동작 원리까지 이해할 수 있다.
         */
    }
}

class Person {
}

class Student {
}