package chapter16_object_string;

public class Object03_Equals {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. equals()란?
         * ======================================
         *
         * equals()는 "두 객체가 같은가?"를 비교할 때 사용하는 메서드이다.
         *
         * 주의:
         * == 와 equals()는 다르다.
         *
         * ==        : 주소값 비교
         * equals()  : 내용 비교(직접 오버라이딩하면)
         */

        /*
         * ======================================
         * 2. == 비교
         * ======================================
         *
         * == 는 두 변수가 "같은 객체를 가리키는가?"를 비교한다.
         */

        EqualsUser user1 = new EqualsUser("admin");
        EqualsUser user2 = new EqualsUser("admin");
        EqualsUser user3 = user1;

        System.out.println(user1 == user2); // false
        System.out.println(user1 == user3); // true

        /*
         * ======================================
         * 3. Object의 기본 equals()
         * ======================================
         *
         * equals()를 오버라이딩하지 않으면
         * 기본적으로 == 와 비슷하게 동작한다.
         *
         * 즉, 주소값 비교처럼 동작한다.
         */

        EqualsUserNoOverride noOverride1 = new EqualsUserNoOverride("kim");
        EqualsUserNoOverride noOverride2 = new EqualsUserNoOverride("kim");

        System.out.println(noOverride1.equals(noOverride2)); // false

        /*
         * ======================================
         * 4. equals() 오버라이딩
         * ======================================
         *
         * 우리가 원하는 건
         * "주소가 다르더라도 내용이 같으면 true"가 나오는 것이다.
         *
         * 그래서 equals()를 직접 재정의한다.
         */

        EqualsUser yesOverride1 = new EqualsUser("lee");
        EqualsUser yesOverride2 = new EqualsUser("lee");
        EqualsUser yesOverride3 = new EqualsUser("park");

        System.out.println(yesOverride1.equals(yesOverride2)); // true
        System.out.println(yesOverride1.equals(yesOverride3)); // false

        /*
         * ======================================
         * 5. String의 equals()
         * ======================================
         *
         * String은 이미 equals()가 오버라이딩되어 있어서
         * 문자열 내용 비교가 가능하다.
         */

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);      // false
        System.out.println(str1.equals(str2)); // true

        /*
         * ======================================
         * 6. equals() 구현 순서
         * ======================================
         *
         * 보통 equals()는 아래 순서로 작성한다.
         *
         * 1) this == obj 이면 true
         * 2) obj가 비교할 타입이 아니면 false
         * 3) 형변환
         * 4) 실제 필드값 비교
         */

        EqualsUser check1 = new EqualsUser("java");
        EqualsUser check2 = new EqualsUser("java");

        System.out.println(check1.equals(check2)); // true

        /*
         * ======================================
         * 7. equals() 사용 이유
         * ======================================
         *
         * 객체 비교에서 진짜 중요한 건
         * "주소가 같은가?"보다
         * "의미상 같은 데이터인가?"인 경우가 많다.
         *
         * 예:
         * - 회원 아이디가 같으면 같은 회원으로 볼지
         * - 상품 코드가 같으면 같은 상품으로 볼지
         * - 학번이 같으면 같은 학생으로 볼지
         *
         * 이런 비교를 위해 equals()를 오버라이딩한다.
         */

        /*
         * ======================================
         * 8. equals() 요약
         * ======================================
         *
         * - == 는 주소값 비교
         * - equals()는 객체 비교 메서드
         * - 기본 equals()는 주소 비교처럼 동작
         * - 내용 비교를 하려면 직접 오버라이딩해야 함
         * - String은 이미 equals()가 오버라이딩되어 있음
         */
    }
}

/*
 * ======================================
 * 9. equals()를 오버라이딩하지 않은 클래스
 * ======================================
 */
class EqualsUserNoOverride {

    String id;

    public EqualsUserNoOverride(String id) {
        this.id = id;
    }
}

/*
 * ======================================
 * 10. equals()를 오버라이딩한 클래스
 * ======================================
 */
class EqualsUser {

    String id;

    public EqualsUser(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        // 1. 자기 자신과 비교하면 true
        if (this == obj) {
            return true;
        }

        // 2. 비교 대상이 EqualsUser 타입이 아니면 false
        if (!(obj instanceof EqualsUser)) {
            return false;
        }

        // 3. 형변환
        EqualsUser other = (EqualsUser) obj;

        // 4. id 값 비교
        return this.id.equals(other.id);
    }
}