package chapter17_util_class;

import java.util.Objects;

public class Objects03_Basic {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. Objects 클래스란?
         * ======================================
         *
         * Objects 클래스는 객체를 다룰 때 자주 사용하는
         * 유틸 메서드들을 모아놓은 클래스이다.
         *
         * 특히 null 검사, 객체 비교, 해시코드 생성 등에서
         * 많이 사용된다.
         *
         * 주의:
         * Object는 모든 클래스의 최상위 부모 클래스이고,
         * Objects는 객체 관련 편의 기능을 제공하는 유틸 클래스이다.
         *
         * 즉,
         * Object != Objects
         */

        /*
         * ======================================
         * 2. Objects.equals()
         * ======================================
         *
         * 두 객체의 값을 비교할 때 사용한다.
         *
         * 특징:
         * - 둘 다 null이면 true
         * - 하나만 null이면 false
         * - 둘 다 값이 있으면 equals() 비교 수행
         *
         * 즉, null-safe 비교가 가능하다.
         */

        String str1 = "hello";
        String str2 = "hello";
        String str3 = null;
        String str4 = null;

        System.out.println("Objects.equals(str1, str2) = " + Objects.equals(str1, str2));
        System.out.println("Objects.equals(str1, str3) = " + Objects.equals(str1, str3));
        System.out.println("Objects.equals(str3, str4) = " + Objects.equals(str3, str4));

        /*
         * ======================================
         * 3. equals()만 직접 쓰면 어떤 문제가 있을까?
         * ======================================
         *
         * null인 객체에서 equals()를 호출하면
         * NullPointerException이 발생할 수 있다.
         */

        String name1 = null;
        String name2 = "홍길동";

        // System.out.println(name1.equals(name2));
        // 위 코드는 NullPointerException 발생 가능

        System.out.println("Objects.equals(name1, name2) = " + Objects.equals(name1, name2));

        /*
         * ======================================
         * 4. Objects.isNull()
         * ======================================
         *
         * 객체가 null이면 true를 반환한다.
         *
         * if문에서 null 체크를 조금 더 명확하게
         * 표현하고 싶을 때 사용할 수 있다.
         */

        String data1 = null;
        String data2 = "Java";

        System.out.println("Objects.isNull(data1) = " + Objects.isNull(data1));
        System.out.println("Objects.isNull(data2) = " + Objects.isNull(data2));

        /*
         * ======================================
         * 5. Objects.nonNull()
         * ======================================
         *
         * 객체가 null이 아니면 true를 반환한다.
         */

        System.out.println("Objects.nonNull(data1) = " + Objects.nonNull(data1));
        System.out.println("Objects.nonNull(data2) = " + Objects.nonNull(data2));

        /*
         * ======================================
         * 6. Objects.toString()
         * ======================================
         *
         * 객체를 문자열로 변환한다.
         *
         * 일반 toString()과 차이점:
         * null이어도 예외가 발생하지 않는다.
         */

        String userName = "이순신";
        String userJob = null;

        System.out.println("Objects.toString(userName) = " + Objects.toString(userName));
        System.out.println("Objects.toString(userJob) = " + Objects.toString(userJob));

        /*
         * ======================================
         * 7. Objects.toString(객체, 기본값)
         * ======================================
         *
         * 객체가 null이면 대신 출력할 기본 문자열을
         * 지정할 수 있다.
         */

        System.out.println("Objects.toString(userName, \"이름없음\") = "
                + Objects.toString(userName, "이름없음"));
        System.out.println("Objects.toString(userJob, \"직업정보없음\") = "
                + Objects.toString(userJob, "직업정보없음"));

        /*
         * ======================================
         * 8. Objects.hash()
         * ======================================
         *
         * 여러 값을 조합하여 해시코드를 생성한다.
         *
         * 주로 hashCode() 오버라이딩할 때 자주 사용된다.
         */

        int hash1 = Objects.hash("홍길동", 20);
        int hash2 = Objects.hash("이순신", 30);

        System.out.println("Objects.hash(\"홍길동\", 20) = " + hash1);
        System.out.println("Objects.hash(\"이순신\", 30) = " + hash2);

        /*
         * ======================================
         * 9. 사용자 정의 클래스 비교 예제
         * ======================================
         *
         * Objects.equals()는 내부적으로 equals()를 사용하므로
         * 클래스에서 equals()를 오버라이딩하면
         * 원하는 기준으로 비교할 수 있다.
         */

        ObjectsMember member1 = new ObjectsMember("김철수", 25);
        ObjectsMember member2 = new ObjectsMember("김철수", 25);
        ObjectsMember member3 = new ObjectsMember("박영희", 28);

        System.out.println("Objects.equals(member1, member2) = " + Objects.equals(member1, member2));
        System.out.println("Objects.equals(member1, member3) = " + Objects.equals(member1, member3));

        /*
         * ======================================
         * 10. null 객체 비교 예제
         * ======================================
         *
         * 사용자 정의 객체도 null-safe 비교 가능하다.
         */

        ObjectsMember member4 = null;

        System.out.println("Objects.equals(member1, member4) = " + Objects.equals(member1, member4));
        System.out.println("Objects.equals(member4, null) = " + Objects.equals(member4, null));

        /*
         * ======================================
         * 11. Objects.requireNonNull()
         * ======================================
         *
         * 객체가 null이면 즉시 예외를 발생시킨다.
         *
         * 보통:
         * "이 값은 절대 null이면 안 된다"
         * 라는 상황에서 사용한다.
         */

        String requiredValue = "필수값";
        String nullValue = null;

        System.out.println("requireNonNull 통과 = " + Objects.requireNonNull(requiredValue));

        // 아래 코드는 실행하면 NullPointerException 발생
        // Objects.requireNonNull(nullValue);

        /*
         * ======================================
         * 12. Objects.requireNonNull(객체, 메시지)
         * ======================================
         *
         * null일 때 예외 메시지를 직접 지정할 수 있다.
         */

        // 아래 코드는 실행하면 지정한 메시지와 함께 예외 발생
        // Objects.requireNonNull(nullValue, "nullValue는 필수값입니다.");

        /*
         * ======================================
         * 13. 실무 느낌 예제
         * ======================================
         *
         * 회원 이름이 null일 수도 있을 때
         * 안전하게 출력하는 예제이다.
         */

        String memberName = null;

        System.out.println("회원 이름: " + Objects.toString(memberName, "이름 미입력"));

        if (Objects.isNull(memberName)) {
            System.out.println("회원 이름이 비어 있습니다.");
        }

        if (Objects.nonNull(member1)) {
            System.out.println("member1 객체는 null이 아닙니다.");
        }

        /*
         * ======================================
         * 14. Objects 클래스 요약
         * ======================================
         *
         * - equals()         : null-safe 객체 비교
         * - isNull()         : null인지 확인
         * - nonNull()        : null이 아닌지 확인
         * - toString()       : null-safe 문자열 변환
         * - hash()           : 해시코드 생성
         * - requireNonNull() : null이면 예외 발생
         *
         * Objects 클래스는
         * null 처리와 객체 비교를 안전하게 하고 싶을 때
         * 매우 유용하게 사용된다.
         */
    }
}

/*
 * ======================================
 * 15. equals(), hashCode()를 오버라이딩한 클래스
 * ======================================
 */
class ObjectsMember {

    String name;
    int age;

    public ObjectsMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ObjectsMember)) {
            return false;
        }

        ObjectsMember other = (ObjectsMember) obj;
        return Objects.equals(this.name, other.name) && this.age == other.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "ObjectsMember{name='" + name + "', age=" + age + "}";
    }
}