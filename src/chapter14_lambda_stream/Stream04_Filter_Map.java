package chapter14_lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream04_Filter_Map {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. Stream 중간 연산
         * ======================================
         *
         * Stream에는
         *
         * 중간연산
         * 최종연산
         *
         * 이 존재한다.
         *
         * 중간연산
         *
         * filter
         * map
         *
         */


        /*
         * ======================================
         * 2. 데이터 준비
         * ======================================
         */

        List<String> list = Arrays.asList(
                "java",
                "spring",
                "react",
                "docker",
                "ai"
        );



        /*
         * ======================================
         * 3. filter
         * ======================================
         *
         * 조건에 맞는 데이터만 필터링
         *
         */

        list.stream()
                .filter(x -> x.length() > 4)
                .forEach(x -> System.out.println("filter 결과 : " + x));



        /*
         * ======================================
         * 4. map
         * ======================================
         *
         * 데이터를 변환
         *
         */

        list.stream()
                .map(x -> x.toUpperCase())
                .forEach(x -> System.out.println("map 결과 : " + x));



        /*
         * ======================================
         * 5. filter + map
         * ======================================
         */

        list.stream()
                .filter(x -> x.length() > 4)
                .map(x -> x.toUpperCase())
                .forEach(x -> System.out.println("filter + map : " + x));



        /*
         * ======================================
         * 6. collect
         * ======================================
         *
         * Stream → List 변환
         *
         */

        List<String> result =
                list.stream()
                        .filter(x -> x.length() > 4)
                        .map(x -> x.toUpperCase())
                        .collect(Collectors.toList());

        System.out.println("collect 결과 : " + result);



        /*
         * ======================================
         * 7. Stream 처리 흐름
         * ======================================
         *
         * list
         *   ↓
         * stream()
         *   ↓
         * filter
         *   ↓
         * map
         *   ↓
         * forEach / collect
         *
         */

    }

}