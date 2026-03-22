package chapter16_object_string;

public class Object04_HashCode {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. hashCode()란?
         * ======================================
         *
         * hashCode()는 객체를 정수값(int)으로 변환한 해시 코드 값을 반환하는 메서드이다.
         *
         * 쉽게 말하면
         * "객체를 구분하기 위한 숫자값" 정도로 먼저 이해하면 된다.
         *
         * 이 메서드도 Object 클래스에 들어 있다.
         */

        /*
         * ======================================
         * 2. Object의 기본 hashCode()
         * ======================================
         *
         * 기본 hashCode()는 객체마다 서로 다른 값처럼 보이는 정수를 반환한다.
         *
         * 보통 같은 객체를 여러 번 호출하면 같은 값이 나오고,
         * 서로 다른 객체면 다른 값이 나오는 경우가 많다.
         */

        HashCodeItem item1 = new HashCodeItem("A001");
        HashCodeItem item2 = new HashCodeItem("A001");

        System.out.println(item1.hashCode());
        System.out.println(item2.hashCode());

        /*
         * ======================================
         * 3. equals()만 오버라이딩하면 문제가 생길 수 있다
         * ======================================
         *
         * 객체의 내용이 같다고 equals()에서 true가 나오게 만들었더라도
         * hashCode()를 같이 오버라이딩하지 않으면
         * 해시 기반 컬렉션(HashSet, HashMap)에서 문제가 생길 수 있다.
         *
         * 즉,
         * equals() 결과가 true이면
         * hashCode() 결과도 같아야 한다.
         */

        HashCodeProduct product1 = new HashCodeProduct("P100");
        HashCodeProduct product2 = new HashCodeProduct("P100");
        HashCodeProduct product3 = new HashCodeProduct("P200");

        System.out.println(product1.equals(product2)); // true
        System.out.println(product1.hashCode());       // 같아야 함
        System.out.println(product2.hashCode());       // 같아야 함

        System.out.println(product1.equals(product3)); // false
        System.out.println(product3.hashCode());

        /*
         * ======================================
         * 4. equals()가 true면 hashCode()도 같아야 한다
         * ======================================
         *
         * 중요 규칙:
         *
         * - 두 객체가 equals()로 같다면
         *   hashCode() 값도 같아야 한다.
         *
         * - 두 객체의 hashCode()가 같다고 해서
         *   무조건 equals()가 true인 것은 아니다.
         */

        HashCodeProduct check1 = new HashCodeProduct("JAVA");
        HashCodeProduct check2 = new HashCodeProduct("JAVA");

        System.out.println(check1.equals(check2));   // true
        System.out.println(check1.hashCode());       // 같음
        System.out.println(check2.hashCode());       // 같음

        /*
         * ======================================
         * 5. String도 hashCode()가 오버라이딩되어 있다
         * ======================================
         *
         * String은 내용이 같으면 hashCode()도 같게 동작한다.
         */

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1.equals(str2));   // true
        System.out.println(str1.hashCode());     // 같음
        System.out.println(str2.hashCode());     // 같음

        /*
         * ======================================
         * 6. 왜 중요할까?
         * ======================================
         *
         * HashSet, HashMap 같은 컬렉션은
         * 객체를 저장하거나 찾을 때 hashCode()를 먼저 사용한다.
         *
         * 그래서 equals()만 고치고 hashCode()를 안 고치면
         * "같은 객체처럼 보여야 하는데 다르게 처리되는 문제"가 생길 수 있다.
         */

        /*
         * ======================================
         * 7. hashCode() 요약
         * ======================================
         *
         * - hashCode()는 객체의 해시 정수값을 반환하는 메서드
         * - Object 클래스에 기본 제공됨
         * - equals()를 오버라이딩하면 hashCode()도 같이 오버라이딩해야 함
         * - HashSet, HashMap에서 매우 중요함
         * - equals()가 true면 hashCode()도 같아야 함
         */
    }
}

/*
 * ======================================
 * 8. hashCode()를 오버라이딩하지 않은 클래스
 * ======================================
 */
class HashCodeItem {

    String code;

    public HashCodeItem(String code) {
        this.code = code;
    }
}

/*
 * ======================================
 * 9. equals()와 hashCode()를 함께 오버라이딩한 클래스
 * ======================================
 */
class HashCodeProduct {

    String code;

    public HashCodeProduct(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HashCodeProduct)) {
            return false;
        }

        HashCodeProduct other = (HashCodeProduct) obj;
        return this.code.equals(other.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}