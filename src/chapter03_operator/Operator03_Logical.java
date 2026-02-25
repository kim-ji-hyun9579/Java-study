package chapter03_operator;

public class Operator03_Logical {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. 논리 연산자란?
         * ===============================
         *
         * boolean 값을 대상으로
         * 조건을 결합하거나 반전시키는 연산자
         *
         * && : AND (그리고)
         * || : OR  (또는)
         * !  : NOT (부정)
         */

        boolean a = true;
        boolean b = false;

        /*
         * ===============================
         * 2. AND (&&)
         * ===============================
         *
         * 둘 다 true일 때만 true
         */

        System.out.println(a && b); // false
        System.out.println(a && true); // true

        /*
         * ===============================
         * 3. OR (||)
         * ===============================
         *
         * 둘 중 하나라도 true면 true
         */

        System.out.println(a || b); // true
        System.out.println(b || false); // false

        /*
         * ===============================
         * 4. NOT (!)
         * ===============================
         *
         * true ↔ false 반전
         */

        System.out.println(!a); // false
        System.out.println(!b); // true

        /*
         * ===============================
         * 5. 비교 연산자 + 논리 연산자
         * ===============================
         */

        int age = 25;

        boolean isAdult = age >= 20;
        boolean isTeen = age >= 13 && age <= 19;

        System.out.println(isAdult); // true
        System.out.println(isTeen);  // false

        /*
         * ===============================
         * 6. if문에서의 활용
         * ===============================
         */

        int score = 85;

        if (score >= 60 && score <= 100) {
            System.out.println("합격");
        }

        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수");
        }

        /*
         * ===============================
         * 7. 단락 평가 (Short-Circuit)
         * ===============================
         *
         * && : 앞이 false면 뒤는 검사 안 함 --> NullPointerException 방지에 중요
         * || : 앞이 true면 뒤는 검사 안 함
         */

        int x = 0;

        if (x != 0 && (10 / x) > 1) {
            System.out.println("실행 안 됨");
        }

        // 위 조건에서 x != 0 이 false라
        // (10 / x)는 아예 실행되지 않음
        // → 에러 발생 X

        /*
         * ===============================
         * 8. 논리 연산자 요약
         * ===============================
         *
         * - && : 모두 true
         * - || : 하나라도 true
         * - !  : 결과 반전
         * - 조건식은 왼쪽부터 평가됨
         * - 단락 평가로 오류 방지 가능
         */
    }
}