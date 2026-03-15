package chapter14_lambda_stream;

public class Lambda01_Basic {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. 람다식(Lambda Expression)이란?
         * ======================================
         *
         * 람다식은
         *
         * "익명 함수를 간단하게 표현하는 문법"
         *
         * 이다.
         *
         * Java 8에서 추가되었다.
         *
         * 기본 문법
         *
         * (매개변수) -> { 실행문 }
         *
         */


        /*
         * ======================================
         * 2. 기존 방식 (익명 클래스)
         * ======================================
         *
         * 람다가 나오기 전에는
         * 익명 클래스를 사용했다.
         */

        Calculator cal1 = new Calculator() {

            @Override
            public int operate(int a, int b) {

                return a + b;

            }

        };

        int result1 = cal1.operate(10, 20);

        System.out.println("익명 클래스 결과 : " + result1);



        /*
         * ======================================
         * 3. 람다식 사용
         * ======================================
         */

        Calculator cal2 = (a, b) -> {

            return a + b;

        };

        int result2 = cal2.operate(10, 20);

        System.out.println("람다 결과 : " + result2);



        /*
         * ======================================
         * 4. 람다식 축약
         * ======================================
         *
         * 한 줄일 경우
         * return과 {} 생략 가능
         */

        Calculator cal3 = (a, b) -> a + b;

        int result3 = cal3.operate(10, 20);

        System.out.println("람다 축약 결과 : " + result3);



        /*
         * ======================================
         * 5. 매개변수 하나일 때
         * ======================================
         */

        Printer printer = message -> System.out.println(message);

        printer.print("람다식 테스트");



        /*
         * ======================================
         * 6. 람다식 장점
         * ======================================
         *
         * 1. 코드가 짧아짐
         * 2. 가독성 증가
         * 3. 함수형 프로그래밍 가능
         *
         */

    }

}



/*
 * ======================================
 * 함수형 인터페이스
 * ======================================
 *
 * 메서드가 하나만 존재하는 인터페이스
 */

@FunctionalInterface
interface Calculator {

    int operate(int a, int b);

}



/*
 * ======================================
 * 매개변수 하나 인터페이스
 * ======================================
 */

@FunctionalInterface
interface Printer {

    void print(String message);

}