package chapter14_lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream03_Basic {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. Stream 이란?
         * ======================================
         *
         * Stream은
         *
         * "데이터를 처리하는 흐름"
         *
         * 이다.
         *
         * 컬렉션(List, Set 등)의 데이터를
         * 함수형 방식으로 처리할 수 있게 해준다.
         *
         */


        /*
         * ======================================
         * 2. 기존 방식 (반복문)
         * ======================================
         */

        List<String> list = Arrays.asList("Java", "Spring", "React", "Docker");

        for (String item : list) {

            System.out.println(item);

        }



        /*
         * ======================================
         * 3. Stream 사용
         * ======================================
         *
         * 컬렉션 → stream()
         */

        Stream<String> stream = list.stream();

        stream.forEach(x -> System.out.println(x));



        /*
         * ======================================
         * 4. Stream 특징
         * ======================================
         *
         * 1. 데이터 저장 안함
         * 2. 원본 변경 안함
         * 3. 1회만 사용 가능
         *
         */


        /*
         * ======================================
         * 5. Stream 한 번만 사용 가능
         * ======================================
         */

        Stream<String> stream2 = list.stream();

        stream2.forEach(x -> System.out.println("출력 : " + x));

        // stream2.forEach(...) ← 여기 다시 쓰면 오류 발생



        /*
         * ======================================
         * 6. Stream 생성 방법
         * ======================================
         */

        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);

        numberStream.forEach(x -> System.out.println("숫자 : " + x));



        /*
         * ======================================
         * 7. Stream + 람다
         * ======================================
         */

        list.stream().forEach(item -> System.out.println("람다 출력 : " + item));

    }

}