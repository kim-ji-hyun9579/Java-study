package chapter12_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection04_Iterator_Basic {

    public static void main(String[] args) {

        /*
         * ============================================
         * 1. Iterator란?
         * ============================================
         *
         * 컬렉션 데이터를
         * 하나씩 접근하기 위한 객체
         *
         * 주로 Set에서 많이 사용
         */


        /*
         * ============================================
         * 2. List 생성
         * ============================================
         */

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("React");
        list.add("Database");


        System.out.println("리스트 : " + list);


        /*
         * ============================================
         * 3. Iterator 생성
         * ============================================
         */

        Iterator<String> iterator = list.iterator();


        /*
         * ============================================
         * 4. Iterator 반복문
         * ============================================
         */

        while(iterator.hasNext()) {

            String data = iterator.next();

            System.out.println("데이터 : " + data);

        }


        /*
         * ============================================
         * 5. Iterator 삭제
         * ============================================
         *
         * 반복문 중 데이터 삭제 가능
         */

        Iterator<String> iter = list.iterator();

        while(iter.hasNext()) {

            String data = iter.next();

            if(data.equals("React")) {

                iter.remove();

            }

        }

        System.out.println("삭제 후 : " + list);


        /*
         * ============================================
         * 6. Iterator 정리
         * ============================================
         *
         *  컬렉션 순회 도구
         *  모든 컬렉션 공통 사용
         *  반복 중 삭제 가능
         *
         */

    }
}