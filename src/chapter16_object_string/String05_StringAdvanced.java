package chapter16_object_string;

public class String05_StringAdvanced {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. String이란?
         * ======================================
         *
         * String은 문자열을 저장하는 클래스이다.
         *
         * 우리가 자주 쓰는
         *
         * "hello"
         * "java"
         * "안녕하세요"
         *
         * 이런 값들이 전부 String 객체이다.
         *
         * 참고:
         * String은 기본자료형이 아니라 참조자료형(클래스)이다.
         */

        String str1 = "hello";
        String str2 = "java";

        System.out.println(str1);
        System.out.println(str2);

        /*
         * ======================================
         * 2. String은 객체이다
         * ======================================
         *
         * String은 클래스이기 때문에 메서드를 사용할 수 있다.
         */

        System.out.println(str1.length());      // 문자열 길이
        System.out.println(str1.toUpperCase()); // 대문자 변환

        /*
         * ======================================
         * 3. String 생성 방법
         * ======================================
         *
         * 방법 1) 리터럴 방식
         * 방법 2) new 방식
         */

        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        /*
         * ======================================
         * 4. == 와 equals() 차이
         * ======================================
         *
         * == 는 주소 비교
         * equals()는 내용 비교
         *
         * String은 equals()가 오버라이딩되어 있어서
         * 문자열 내용 비교가 가능하다.
         */

        System.out.println(s1 == s2);       // true 가능성 높음 (같은 문자열 리터럴 공유)
        System.out.println(s3 == s4);       // false (new로 각각 생성)
        System.out.println(s1.equals(s2));  // true
        System.out.println(s3.equals(s4));  // true

        /*
         * ======================================
         * 5. String은 불변(immutable) 객체이다
         * ======================================
         *
         * 불변 객체란
         * 한번 만들어진 값이 변경되지 않는 객체를 말한다.
         *
         * 아래 코드를 보면
         * str3 값을 바꾸는 것처럼 보이지만
         * 실제로는 새로운 문자열 객체가 만들어진다.
         */

        String str3 = "hello";
        str3 = str3 + " world";

        System.out.println(str3); // hello world

        /*
         * ======================================
         * 6. 주요 메서드 - length()
         * ======================================
         *
         * 문자열 길이를 반환한다.
         */

        String text1 = "abcdef";
        System.out.println(text1.length()); // 6

        /*
         * ======================================
         * 7. 주요 메서드 - charAt()
         * ======================================
         *
         * 특정 위치의 문자를 가져온다.
         * 인덱스는 0부터 시작한다.
         */

        String text2 = "java";
        System.out.println(text2.charAt(0)); // j
        System.out.println(text2.charAt(1)); // a

        /*
         * ======================================
         * 8. 주요 메서드 - substring()
         * ======================================
         *
         * 문자열 일부를 잘라서 반환한다.
         *
         * substring(시작인덱스)
         * substring(시작인덱스, 끝인덱스)
         *
         * 끝인덱스는 포함되지 않는다.
         */

        String text3 = "HelloJava";
        System.out.println(text3.substring(5));    // Java
        System.out.println(text3.substring(0, 5)); // Hello

        /*
         * ======================================
         * 9. 주요 메서드 - equals()
         * ======================================
         *
         * 문자열 내용을 비교한다.
         */

        String id1 = "admin";
        String id2 = "admin";
        String id3 = "user";

        System.out.println(id1.equals(id2)); // true
        System.out.println(id1.equals(id3)); // false

        /*
         * ======================================
         * 10. 주요 메서드 - contains()
         * ======================================
         *
         * 특정 문자열이 포함되어 있는지 확인한다.
         */

        String message = "I love java";
        System.out.println(message.contains("java"));   // true
        System.out.println(message.contains("python")); // false

        /*
         * ======================================
         * 11. 주요 메서드 - startsWith(), endsWith()
         * ======================================
         *
         * startsWith() : 특정 문자열로 시작하는지
         * endsWith()   : 특정 문자열로 끝나는지
         */

        String fileName = "report.pdf";
        System.out.println(fileName.startsWith("rep")); // true
        System.out.println(fileName.endsWith(".pdf"));  // true

        /*
         * ======================================
         * 12. 주요 메서드 - indexOf()
         * ======================================
         *
         * 특정 문자의 위치를 반환한다.
         * 없으면 -1 반환
         */

        String text4 = "apple";
        System.out.println(text4.indexOf("p")); // 1
        System.out.println(text4.indexOf("z")); // -1

        /*
         * ======================================
         * 13. 주요 메서드 - replace()
         * ======================================
         *
         * 문자열의 일부를 다른 문자열로 변경한다.
         * 원본이 바뀌는 것이 아니라 새로운 문자열을 반환한다.
         */

        String text5 = "java";
        String changed = text5.replace("java", "spring");

        System.out.println(text5);   // java
        System.out.println(changed); // spring

        /*
         * ======================================
         * 14. 주요 메서드 - trim()
         * ======================================
         *
         * 앞뒤 공백 제거
         */

        String text6 = "   hello java   ";
        System.out.println(text6.trim());

        /*
         * ======================================
         * 15. 주요 메서드 - toUpperCase(), toLowerCase()
         * ======================================
         *
         * 대문자 / 소문자 변환
         */

        String text7 = "Java";
        System.out.println(text7.toUpperCase()); // JAVA
        System.out.println(text7.toLowerCase()); // java

        /*
         * ======================================
         * 16. split()
         * ======================================
         *
         * 특정 기준으로 문자열을 나누어 배열로 반환한다.
         */

        String fruits = "apple,banana,orange";
        String[] fruitArr = fruits.split(",");

        System.out.println(fruitArr[0]); // apple
        System.out.println(fruitArr[1]); // banana
        System.out.println(fruitArr[2]); // orange

        /*
         * ======================================
         * 17. 문자열은 + 로 연결 가능
         * ======================================
         */

        String name = "홍길동";
        int age = 20;

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이름: " + name + ", 나이: " + age);

        /*
         * ======================================
         * 18. String 요약
         * ======================================
         *
         * - String은 문자열을 저장하는 클래스
         * - 참조자료형이다
         * - equals()로 내용 비교
         * - 불변(immutable) 객체이다
         * - 문자열 처리 메서드가 매우 많다
         * - 실무에서 가장 많이 쓰는 클래스 중 하나다
         */
    }
}