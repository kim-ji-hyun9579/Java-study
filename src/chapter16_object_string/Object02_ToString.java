package chapter16_object_string;

public class Object02_ToString {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. toString() 이란?
         * ======================================
         *
         * toString()은 객체를 문자열 형태로 표현할 때 사용하는 메서드이다.
         *
         * 객체를 출력하면 내부적으로 toString()이 자동 호출된다.
         */

        /*
         * ======================================
         * 2. Object의 기본 toString() 확인
         * ======================================
         *
         * toString()을 오버라이딩하지 않으면
         * Object 클래스의 기본 toString() 결과가 출력된다.
         *
         * 보통:
         * 클래스이름@해시코드
         * 형태로 나온다.
         */

        ToStringPerson person = new ToStringPerson("홍길동", 20);

        System.out.println(person);
        System.out.println(person.toString());

        /*
         * ======================================
         * 3. 왜 기본 toString()이 불편할까?
         * ======================================
         *
         * 객체 안에 어떤 값이 들어있는지 바로 보기 어렵다.
         * 그래서 보통 직접 오버라이딩한다.
         */

        /*
         * ======================================
         * 4. toString() 오버라이딩
         * ======================================
         */

        ToStringMember member = new ToStringMember("이순신", 30);

        System.out.println(member);
        System.out.println(member.toString());

        /*
         * ======================================
         * 5. 문자열 연결에서도 toString() 호출
         * ======================================
         */

        System.out.println("회원 정보: " + member);

        /*
         * ======================================
         * 6. toString() 요약
         * ======================================
         *
         * - 객체를 문자열로 표현하는 메서드
         * - 객체 출력 시 자동 호출
         * - 기본 toString()은 보기 불편
         * - 직접 오버라이딩해서 많이 사용
         */
    }
}

/*
 * ======================================
 * 7. toString()을 오버라이딩하지 않은 클래스
 * ======================================
 */
class ToStringPerson {

    String name;
    int age;

    public ToStringPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/*
 * ======================================
 * 8. toString()을 오버라이딩한 클래스
 * ======================================
 */
class ToStringMember {

    String name;
    int age;

    public ToStringMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ToStringMember{name='" + name + "', age=" + age + "}";
    }
}