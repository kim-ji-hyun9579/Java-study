package chapter12_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection03_HashMap_Basic {

    public static void main(String[] args) {

        /*
         * ============================================
         * 1. Map이란?
         * ============================================
         *
         * key - value 구조로 데이터를 저장
         *
         * 특징
         *
         *  key 중복 불가
         *  value 중복 가능
         *  순서 없음
         *
         * 대표 구현 클래스
         *
         * HashMap
         */


        /*
         * ============================================
         * 2. HashMap 생성
         * ============================================
         */

        Map<String, String> map = new HashMap<>();


        /*
         * ============================================
         * 3. 데이터 추가 (put)
         * ============================================
         */

        map.put("id", "user01");
        map.put("name", "홍길동");
        map.put("age", "25");
        map.put("job", "developer");


        /*
         * 현재 구조
         *
         * key      value
         * ----------------
         * id       user01
         * name     홍길동
         * age      25
         * job      developer
         */


        System.out.println("전체 데이터 : " + map);


        /*
         * ============================================
         * 4. 데이터 조회 (get)
         * ============================================
         */

        String id = map.get("id");
        String name = map.get("name");

        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);


        /*
         * ============================================
         * 5. 데이터 수정
         * ============================================
         *
         * 같은 key로 put하면 값이 수정됨
         */

        map.put("age", "30");

        System.out.println("수정 후 : " + map);


        /*
         * ============================================
         * 6. 데이터 존재 여부 확인
         * ============================================
         */

        boolean keyCheck = map.containsKey("id");
        boolean valueCheck = map.containsValue("홍길동");

        System.out.println("id 존재 여부 : " + keyCheck);
        System.out.println("홍길동 존재 여부 : " + valueCheck);


        /*
         * ============================================
         * 7. 데이터 삭제
         * ============================================
         */

        map.remove("job");

        System.out.println("삭제 후 : " + map);


        /*
         * ============================================
         * 8. Map 전체 출력
         * ============================================
         */

        Set<String> keys = map.keySet();

        for(String key : keys) {

            System.out.println(key + " : " + map.get(key));

        }


        /*
         * ============================================
         * 9. Map 크기
         * ============================================
         */

        System.out.println("Map 크기 : " + map.size());


        /*
         * ============================================
         * 10. 전체 삭제
         * ============================================
         */

        map.clear();

        System.out.println("삭제 후 크기 : " + map.size());


        /*
         * ============================================
         * 11. HashMap 정리
         * ============================================
         *
         *  key-value 구조
         *  key 중복 불가
         *  value 중복 가능
         *  데이터 검색 매우 빠름
         *
         */
    }
}