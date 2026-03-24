package chapter16_object_string;

public class String06_StringBuilder {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. StringBuilder란?
         * ======================================
         *
         * StringBuilder는 문자열을 "효율적으로 수정"하기 위한 클래스이다.
         *
         * String은 불변(immutable) 객체이기 때문에
         * 문자열을 더하거나 수정할 때마다 새로운 객체가 만들어진다.
         *
         * 반면 StringBuilder는
         * 내부 문자열 값을 변경하면서 작업할 수 있다.
         *
         * 그래서 문자열을 반복해서 붙이거나 수정할 때
         * String보다 성능상 유리하다.
         */

        /*
         * ======================================
         * 2. String의 문자열 연결
         * ======================================
         *
         * String은 + 연산으로 문자열을 쉽게 붙일 수 있다.
         * 하지만 많이 반복하면 비효율적일 수 있다.
         */

        String str = "hello";
        str = str + " ";
        str = str + "java";

        System.out.println(str); // hello java

        /*
         * ======================================
         * 3. StringBuilder 생성
         * ======================================
         */

        StringBuilder sb1 = new StringBuilder();

        /*
         * ======================================
         * 4. append()
         * ======================================
         *
         * append()는 문자열을 뒤에 추가한다.
         */

        sb1.append("hello");
        sb1.append(" ");
        sb1.append("java");

        System.out.println(sb1); // hello java

        /*
         * ======================================
         * 5. append()는 연속 호출 가능
         * ======================================
         *
         * 메서드 체이닝 방식으로 이어서 쓸 수 있다.
         */

        StringBuilder sb2 = new StringBuilder();
        sb2.append("A").append("B").append("C");

        System.out.println(sb2); // ABC

        /*
         * ======================================
         * 6. insert()
         * ======================================
         *
         * 원하는 위치에 문자열을 삽입한다.
         */

        StringBuilder sb3 = new StringBuilder("HelloJava");
        sb3.insert(5, " ");

        System.out.println(sb3); // Hello Java

        /*
         * ======================================
         * 7. delete()
         * ======================================
         *
         * 시작 인덱스부터 끝 인덱스 전까지 삭제한다.
         * 끝 인덱스는 포함되지 않는다.
         */

        StringBuilder sb4 = new StringBuilder("Hello Java");
        sb4.delete(5, 6);

        System.out.println(sb4); // HelloJava

        /*
         * ======================================
         * 8. replace()
         * ======================================
         *
         * 특정 구간의 문자열을 다른 문자열로 바꾼다.
         */

        StringBuilder sb5 = new StringBuilder("I like java");
        sb5.replace(7, 11, "spring");

        System.out.println(sb5); // I like spring

        /*
         * ======================================
         * 9. reverse()
         * ======================================
         *
         * 문자열 순서를 뒤집는다.
         */

        StringBuilder sb6 = new StringBuilder("abcde");
        sb6.reverse();

        System.out.println(sb6); // edcba

        /*
         * ======================================
         * 10. length()
         * ======================================
         *
         * 현재 문자열 길이를 반환한다.
         */

        StringBuilder sb7 = new StringBuilder("hello");
        System.out.println(sb7.length()); // 5

        /*
         * ======================================
         * 11. charAt()
         * ======================================
         *
         * 특정 위치의 문자를 가져온다.
         */

        StringBuilder sb8 = new StringBuilder("java");
        System.out.println(sb8.charAt(0)); // j
        System.out.println(sb8.charAt(2)); // v

        /*
         * ======================================
         * 12. setCharAt()
         * ======================================
         *
         * 특정 위치의 문자를 변경한다.
         */

        StringBuilder sb9 = new StringBuilder("java");
        sb9.setCharAt(0, 'J');

        System.out.println(sb9); // Java

        /*
         * ======================================
         * 13. toString()
         * ======================================
         *
         * StringBuilder를 String으로 바꿀 때 사용한다.
         */

        StringBuilder sb10 = new StringBuilder("Hello Builder");
        String result = sb10.toString();

        System.out.println(result); // Hello Builder

        /*
         * ======================================
         * 14. String vs StringBuilder
         * ======================================
         *
         * String
         * - 불변 객체
         * - 단순 문자열 표현에 적합
         * - 문자열 수정이 많으면 비효율적일 수 있음
         *
         * StringBuilder
         * - 가변 객체처럼 동작
         * - 문자열 추가/수정/삭제가 많을 때 유리
         */

        /*
         * ======================================
         * 15. 반복문에서 문자열 연결 비교
         * ======================================
         *
         * 문자열을 많이 붙일수록 StringBuilder가 더 적합하다.
         */

        String text1 = "";
        for (int i = 1; i <= 5; i++) {
            text1 = text1 + i;
        }
        System.out.println(text1); // 12345

        StringBuilder text2 = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            text2.append(i);
        }
        System.out.println(text2); // 12345

        /*
         * ======================================
         * 16. 언제 StringBuilder를 쓸까?
         * ======================================
         *
         * - 반복문 안에서 문자열을 계속 더할 때
         * - 문자열을 자주 수정/삭제/삽입할 때
         * - 성능을 조금 더 고려해야 할 때
         */

        /*
         * ======================================
         * 17. StringBuilder 요약
         * ======================================
         *
         * - 문자열을 효율적으로 다루기 위한 클래스
         * - String보다 수정 작업에 유리함
         * - append(), insert(), delete(), replace() 자주 사용
         * - 마지막에 필요하면 toString()으로 String 변환 가능
         */
    }
}