package chapter12_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection05_CollectionsSort_Basic {

    public static void main(String[] args) {

        /*
         * ============================================
         * 1. 정렬이란?
         * ============================================
         *
         * 데이터를 일정한 기준으로
         * 순서대로 나열하는 것
         *
         * 오름차순
         * 1 2 3 4 5
         *
         * 내림차순
         * 5 4 3 2 1
         */


        /*
         * ============================================
         * 2. List 생성
         * ============================================
         */

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(3);


        System.out.println("정렬 전 : " + numbers);


        /*
         * ============================================
         * 3. 오름차순 정렬
         * ============================================
         */

        Collections.sort(numbers);

        System.out.println("오름차순 : " + numbers);


        /*
         * ============================================
         * 4. 내림차순 정렬
         * ============================================
         */

        Collections.reverse(numbers);

        System.out.println("내림차순 : " + numbers);


        /*
         * ============================================
         * 5. 문자열 정렬
         * ============================================
         */

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Alice");
        names.add("John");
        names.add("Mike");

        System.out.println("정렬 전 : " + names);


        Collections.sort(names);

        System.out.println("문자열 정렬 : " + names);


        /*
         * ============================================
         * 6. 랜덤 섞기
         * ============================================
         */

        Collections.shuffle(names);

        System.out.println("랜덤 섞기 : " + names);


        /*
         * ============================================
         * 7. Collections.sort 정리
         * ============================================
         *
         *  List만 정렬 가능
         *  기본 오름차순 정렬
         *  숫자 / 문자열 정렬 가능
         *
         */

    }
}