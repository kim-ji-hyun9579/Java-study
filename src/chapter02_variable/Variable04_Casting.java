package chapter02_variable;

import java.lang.reflect.Type;

public class Variable04_Casting {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. 형변환(Casting)이란?
         * ===============================
         *
         * - 데이터 타입을 다른 타입으로 변환하는 것
         * - 기본 타입끼리 가능
         * - 크기와 표현 범위에 따라 규칙이 다르다
         */

        /*
         * ===============================
         * 2. 자동 형변환 (Widening Casting)
         * ===============================
         *
         * 작은 타입 → 큰 타입
         * 데이터 손실 없음
         * JVM이 자동으로 처리
         */

        int i = 100;
        long l = i;        // int → long
        double d = l;      // long → double

        System.out.println(d);


        /*
         * 내부 흐름 (Stack 메모리)
         *
         * i : 100
         * l : 100
         * d : 100.0
         *
         * 값이 복사되며, 기존 변수는 그대로 유지됨
         */


        /*
         * ===============================
         * 3. 강제 형변환 (Narrowing Casting)
         * ===============================
         *
         * 큰 타입 → 작은 타입
         * 데이터 손실 가능
         * 개발자가 명시적으로 캐스팅
         */

        double d2 = 10.9;
        int i2 = (int) d2;   // 소수점 버림

        System.out.println(i2); // 10


        /*
         * ===============================
         * 4. 데이터 손실 예제
         * ===============================
         */

        int big = 1000;
        byte small = (byte) big;

        System.out.println(small);

        /*
         * byte 범위: -128 ~ 127
         * 1000은 범위를 초과 → 값이 깨짐
         */


        /*
         * ===============================
         * 5. 연산 시 자동 형변환 규칙
         * ===============================
         *
         * - byte, short, char → int로 승격
         * - 연산 결과는 최소 int
         */

        byte b1 = 10;
        byte b2 = 20;

        // byte b3 = b1 + b2; // 컴파일 에러
        int result = b1 + b2; // OK

        System.out.println(result);


        /*
         * ===============================
         * 6. char와 int의 관계
         * ===============================
         */

        char c = 'A';      // 유니코드 65
        int code = c;      // 자동 형변환

        System.out.println(code); // 65

        char c2 = (char) 66;
        System.out.println(c2);   // B


        /*
         * ===============================
         * 7. String과 기본 타입 변환
         * ===============================
         */

        // 기본 타입 → String
        int num = 100;
        String s1 = String.valueOf(num);
        String s2 = num + "100"; // 많이 쓰는 방식

        System.out.println(s1.getClass()); // class java.lang.String
        System.out.println(s2);

        // String → 기본 타입
        String strNum = "200";
        int parsed = Integer.parseInt(strNum);

        System.out.println(parsed + 10); // 210


        /*
         * ===============================
         * 8. String 변환 시 주의사항
         * ===============================
         */

        // String wrong = "10a";
        // int error = Integer.parseInt(wrong); //  NumberFormatException


        /*
         * ===============================
         * 9. Casting 정리 요약
         * ===============================
         *
         * - 자동 형변환: 작은 → 큰 (안전)
         * - 강제 형변환: 큰 → 작은 (손실 가능)
         * - 연산은 최소 int 단위
         * - char는 숫자로 변환 가능
         * - String ↔ 기본 타입 변환은 메서드 사용
         */
    }
}