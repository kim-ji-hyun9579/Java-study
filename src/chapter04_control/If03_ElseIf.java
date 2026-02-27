package chapter04_control;

public class If03_ElseIf {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. else if 문이란?
         * ===============================
         *
         * 여러 조건 중
         * 하나를 선택해서 실행하는 조건문
         *
         * if - else if - else 구조는
         * "여러 갈래 중 하나만 실행"할 때 사용한다.
         */

        int score = 82;

        /*
         * ===============================
         * 2. else if 기본 구조
         * ===============================
         *
         * if (조건1) {
         *     조건1이 true일 때 실행
         * } else if (조건2) {
         *     조건1은 false, 조건2가 true일 때 실행
         * } else {
         *     모든 조건이 false일 때 실행
         * }
         */

        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80) {
            System.out.println("B 학점");
        } else if (score >= 70) {
            System.out.println("C 학점");
        } else {
            System.out.println("F 학점");
        }

        /*
         * ===============================
         * 3. else if 실행 흐름
         * ===============================
         *
         * 1) if 조건 검사
         * 2) true → 실행 후 전체 종료
         * 3) false → else if 조건 검사
         * 4) 조건이 true가 되는 순간 실행 후 종료
         * 5) 전부 false면 else 실행
         *
         *  한 번에 하나만 실행된다
         */

        /*
         * ===============================
         * 4. 조건 순서가 중요한 이유
         * ===============================
         *
         * else if는
         * 위에서부터 순서대로 검사한다.
         *
         * 조건 순서가 잘못되면
         * 의도와 다른 결과가 나온다.
         */

        int point = 85;

        // 잘못된 예 (큰 범위를 먼저 검사)
        if (point >= 60) {
            System.out.println("합격");
        } else if (point >= 90) {
            System.out.println("우수");
        }

        /*
         * 위 코드에서는
         * point가 90 이상이어도
         * 이미 point >= 60에서 걸려서
         * 아래 조건은 절대 실행되지 않는다.
         */

        /*
         * ===============================
         * 5. 올바른 조건 설계 순서
         * ===============================
         *
         *  범위가 좁은 조건을 위에
         *  범위가 넓은 조건을 아래에
         */

        if (point >= 90) {
            System.out.println("우수");
        } else if (point >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        /*
         * ===============================
         * 6. else는 생략 가능하다
         * ===============================
         *
         * 모든 경우를 처리할 필요가 없다면
         * else는 생략할 수 있다.
         */

        int age = 20;

        if (age < 8) {
            System.out.println("유아");
        } else if (age < 14) {
            System.out.println("초등학생");
        } else if (age < 20) {
            System.out.println("청소년");
        }

        /*
         * 조건에 해당하지 않으면
         * 아무 것도 실행되지 않는다.
         */

        /*
         * ===============================
         * 7. boolean 변수로 조건 정리
         * ===============================
         *
         * 조건식을 변수로 분리하면
         * 가독성과 의도가 더 명확해진다.
         */

        int money = 12000;

        boolean canBuyCoffee = money >= 4500;
        boolean canBuyLunch  = money >= 9000;

        if (canBuyLunch) {
            System.out.println("점심 가능");
        } else if (canBuyCoffee) {
            System.out.println("커피 가능");
        } else {
            System.out.println("아무 것도 못 삼");
        }

        /*
         * ===============================
         * 8. else if 주의사항 정리
         * ===============================
         *
         * - 위에서부터 순서대로 검사
         * - 조건이 true가 되면 바로 종료
         * - 조건 순서가 로직의 핵심
         * - 중괄호 생략은 지양
         */

        /*
         * ===============================
         * 9. else if 요약
         * ===============================
         *
         * - 여러 조건 중 하나 선택
         * - 조건 설계 능력이 중요
         * - 실무, 시험, 면접 모두 자주 등장
         */
    }
}