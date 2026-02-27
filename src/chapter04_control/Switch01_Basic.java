package chapter04_control;

public class Switch01_Basic {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. switch 문이란?
         * ===============================
         *
         * 하나의 변수 값에 따라
         * 여러 경우(case) 중
         * 하나를 선택해서 실행하는 조건문
         *
         * if - else if 와 비슷하지만
         * "값이 정확히 일치하는 경우"에 적합하다.
         */

        int menu = 2;

        /*
         * ===============================
         * 2. switch 기본 구조
         * ===============================
         *
         * switch (변수) {
         *     case 값1:
         *         실행문;
         *         break;
         *     case 값2:
         *         실행문;
         *         break;
         *     default:
         *         실행문;
         * }
         */

        switch (menu) {
            case 1:
                System.out.println("아메리카노");
                break;
            case 2:
                System.out.println("카페라떼");
                break;
            case 3:
                System.out.println("카푸치노");
                break;
            default:
                System.out.println("메뉴가 없습니다.");
        }

        /*
         * ===============================
         * 3. break의 역할
         * ===============================
         *
         * break는
         * switch 문을 즉시 종료한다.
         *
         * break가 없으면
         * 아래 case까지 계속 실행된다.
         */

        int number = 1;

        switch (number) {
            case 1:
                System.out.println("1번 선택");
            case 2:
                System.out.println("2번 선택");
            case 3:
                System.out.println("3번 선택");
        }

        /*
         * 위 코드 실행 결과:
         * 1번 선택
         * 2번 선택
         * 3번 선택
         *
         * → 이를 fall-through 현상이라고 한다.
         */

        /*
         * ===============================
         * 4. break를 사용한 정상적인 흐름
         * ===============================
         */

        switch (number) {
            case 1:
                System.out.println("1번 선택");
                break;
            case 2:
                System.out.println("2번 선택");
                break;
            case 3:
                System.out.println("3번 선택");
                break;
        }

        /*
         * ===============================
         * 5. default의 역할
         * ===============================
         *
         * case에 해당하는 값이 없을 때
         * 실행되는 영역
         *
         * default는 생략 가능하지만
         * 예외 처리를 위해 보통 작성한다.
         */

        int level = 5;

        switch (level) {
            case 1:
                System.out.println("관리자");
                break;
            case 2:
                System.out.println("일반 회원");
                break;
            default:
                System.out.println("권한 없음");
        }

        /*
         * ===============================
         * 6. switch에서 사용 가능한 타입
         * ===============================
         *
         * Java switch는 다음 타입만 사용 가능
         *
         * - int, byte, short, char
         * - String
         * - enum
         *
         *  실수(double, float)는 사용 불가
         */

        String day = "MON";

        switch (day) {
            case "MON":
                System.out.println("월요일");
                break;
            case "TUE":
                System.out.println("화요일");
                break;
            case "WED":
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
        }

        /*
         * ===============================
         * 7. switch vs else if
         * ===============================
         *
         * switch:
         * - 값이 정확히 일치할 때
         * - 코드가 깔끔해짐
         *
         * else if:
         * - 범위 비교 가능
         * - 조건식이 자유로움
         */

        int score = 85;

        // else if (범위 비교)
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C 이하");
        }

        // switch는 이런 범위 비교에 부적합

        /*
         * ===============================
         * 8. switch 사용 시 주의사항
         * ===============================
         *
         * - case 값은 상수여야 한다
         * - break 누락 주의
         * - 조건식(>, <) 사용 불가
         * - 값 비교 전용
         */

        /*
         * ===============================
         * 9. switch 요약
         * ===============================
         *
         * - 값 하나로 분기 처리
         * - 정확한 일치 비교에 적합
         * - break는 거의 필수
         * - else if 대체용이 아님
         */
    }
}