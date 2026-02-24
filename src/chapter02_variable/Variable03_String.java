package chapter02_variable;

public class Variable03_String {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. String은 기본 타입이 아니다
         * ===============================
         *
         * - String은 class(객체)다
         * - 기본 타입처럼 보이지만 참조 타입
         * - 값이 아니라 "객체의 주소(참조)"를 변수에 저장
         */

        String name = "홍길동";


        /*
         * ===============================
         * 2. String 변수는 어디에 저장될까?
         * ===============================
         *
         * - 변수(name)  : Stack 메모리
         * - 문자열 객체("홍길동") : Heap 메모리
         *
         * Stack                  Heap
         * ┌──────────┐           ┌──────────────┐
         * │ name ----│---------> │ "홍길동" 객체 │
         * └──────────┘           └──────────────┘
         *
         * name 변수에는 "홍길동" 자체가 아니라
         * Heap에 있는 객체의 주소가 들어있다.
         */


        /*
         * ===============================
         * 3. String 리터럴 풀(String Pool)
         * ===============================
         */

        String a = "java";
        String b = "java";

        /*
         * - String 리터럴은 String Pool에 저장된다
         * - 같은 문자열 리터럴은 하나의 객체를 공유
         */

        System.out.println(a == b);      // true
        System.out.println(a.equals(b)); // true


        /*
         * ===============================
         * 4. new String()은 다르다
         * ===============================
         */

        String c = new String("java");

        /*
         * - new를 사용하면 Heap에 새로운 객체를 강제로 생성
         * - String Pool을 사용하지 않는다
         */

        System.out.println(a == c);      // false (주소 비교)
        System.out.println(a.equals(c)); // true  (값 비교)


        /*
         * ===============================
         * 5. == 와 equals()의 차이
         * ===============================
         *
         * ==        : 주소 비교 (참조 비교)
         * equals()  : 값 비교 (String은 내부 문자 비교로 재정의됨)
         */

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2);        // true
        System.out.println(s1 == s3);        // false
        System.out.println(s1.equals(s3));   // true


        /*
         * ===============================
         * 6. String은 불변(immutable) 객체
         * ===============================
         */

        String str = "abc";
        System.out.println(str);

        str = str + "def";
        System.out.println(str);

        /*
         * 이 과정에서 무슨 일이 일어날까?
         *
         * 1. "abc" 객체 생성
         * 2. "def" 객체 생성
         * 3. "abcdef" 새로운 객체 생성
         * 4. str 참조가 새 객체를 가리킴
         *
         * 기존 "abc" 객체는 변경되지 않는다.
         */

        /*
         * Stack                  Heap
         * ┌──────────┐           ┌──────────────┐
         * │ str ---- │---------> │ "abcdef"     │
         * └──────────┘           └──────────────┘
         *
         * "abc"는 더 이상 참조되지 않으면
         * 나중에 GC(Garbage Collector) 대상이 된다.
         */


        /*
         * ===============================
         * 7. null과 String
         * ===============================
         */

        String text = null;

        // System.out.println(text.length()); // NullPointerException

        /*
         * - 기본 타입은 null 불가
         * - 참조 타입(String)은 null 가능
         * - null = "아무 객체도 가리키지 않음"
         */


        /*
         * ===============================
         * 8. String 정리 요약
         * ===============================
         *
         * - String은 참조 타입(객체)
         * - 변수는 Stack, 객체는 Heap
         * - == 는 주소 비교
         * - equals() 는 값 비교
         * - String은 불변 객체
         * - 문자열 리터럴은 String Pool 사용
         */
    }
}