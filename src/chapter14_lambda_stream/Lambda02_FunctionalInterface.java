package chapter14_lambda_stream;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda02_FunctionalInterface {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. 함수형 인터페이스(Function Interface)
         * ======================================
         *
         * 함수형 인터페이스란
         *
         * "메서드가 하나만 존재하는 인터페이스"
         *
         * 이다.
         *
         * 람다는 반드시
         *
         * 함수형 인터페이스에서만 사용할 수 있다.
         */


        /*
         * ======================================
         * 2. Java에서 제공하는 함수형 인터페이스
         * ======================================
         *
         * Java는 기본적으로 많이 사용하는
         * 함수형 인터페이스를 제공한다.
         *
         * 대표적으로
         *
         * Function
         * Predicate
         * Consumer
         * Supplier
         *
         */


        /*
         * ======================================
         * 3. Function
         * ======================================
         *
         * 입력 → 변환 → 출력
         *
         * T -> R
         *
         */

        Function<Integer, Integer> function = x -> x * 2;

        int result1 = function.apply(10);

        System.out.println("Function 결과 : " + result1);



        /*
         * ======================================
         * 4. Predicate
         * ======================================
         *
         * 조건 검사
         *
         * 결과는 boolean
         */

        Predicate<Integer> predicate = x -> x > 10;

        boolean result2 = predicate.test(15);

        System.out.println("Predicate 결과 : " + result2);



        /*
         * ======================================
         * 5. Consumer
         * ======================================
         *
         * 값을 받아서 사용
         *
         * 반환값 없음
         */

        Consumer<String> consumer = message -> {

            System.out.println("Consumer 출력 : " + message);

        };

        consumer.accept("람다 Consumer 테스트");



        /*
         * ======================================
         * 6. Supplier
         * ======================================
         *
         * 값을 생성해서 반환
         *
         * 입력값 없음
         */

        Supplier<Double> supplier = () -> Math.random();

        double result3 = supplier.get();

        System.out.println("Supplier 결과 : " + result3);



        /*
         * ======================================
         * 7. 정리
         * ======================================
         *
         * Function
         * 입력 → 출력
         *
         * Predicate
         * 조건 검사
         *
         * Consumer
         * 입력값 사용
         *
         * Supplier
         * 값 생성
         */

    }

}