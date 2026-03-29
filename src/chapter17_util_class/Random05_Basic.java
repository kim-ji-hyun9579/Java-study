package chapter17_util_class;

import java.util.Random;

public class Random05_Basic {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. Random 클래스란?
         * ======================================
         *
         * Random 클래스는 난수(랜덤값)를 만들 때 사용하는 클래스이다.
         *
         * Math.random()도 난수를 만들 수 있지만,
         * Random 클래스는 더 다양한 형태의 난수를 만들 수 있다.
         *
         * 예:
         * - 정수 난수
         * - 실수 난수
         * - 논리값 난수
         * - 범위 지정 난수
         */

        Random random = new Random();

        /*
         * ======================================
         * 2. nextInt()
         * ======================================
         *
         * int 범위 안에서 임의의 정수를 반환한다.
         *
         * 범위를 지정하지 않으면
         * 너무 큰 값이나 음수도 나올 수 있다.
         */

        int randomInt1 = random.nextInt();
        System.out.println("random.nextInt() = " + randomInt1);

        /*
         * ======================================
         * 3. nextInt(범위)
         * ======================================
         *
         * 0 이상 범위 미만의 정수를 반환한다.
         *
         * 예:
         * random.nextInt(10)
         * -> 0 ~ 9
         */

        int randomInt2 = random.nextInt(10);
        System.out.println("random.nextInt(10) = " + randomInt2);

        /*
         * ======================================
         * 4. 원하는 범위의 정수 만들기
         * ======================================
         *
         * 예를 들어 1 ~ 10 사이의 정수를 만들고 싶으면
         *
         * random.nextInt(10) + 1
         *
         * 로 작성한다.
         *
         * 설명:
         * random.nextInt(10) -> 0 ~ 9
         * +1 -> 1 ~ 10
         */

        int randomInt3 = random.nextInt(10) + 1;
        System.out.println("1~10 랜덤 정수 = " + randomInt3);

        /*
         * ======================================
         * 5. nextDouble()
         * ======================================
         *
         * 0.0 이상 1.0 미만의 실수를 반환한다.
         */

        double randomDouble = random.nextDouble();
        System.out.println("random.nextDouble() = " + randomDouble);

        /*
         * ======================================
         * 6. nextBoolean()
         * ======================================
         *
         * true 또는 false 중 하나를 랜덤으로 반환한다.
         */

        boolean randomBoolean = random.nextBoolean();
        System.out.println("random.nextBoolean() = " + randomBoolean);

        /*
         * ======================================
         * 7. nextLong()
         * ======================================
         *
         * long 범위 안에서 임의의 값을 반환한다.
         */

        long randomLong = random.nextLong();
        System.out.println("random.nextLong() = " + randomLong);

        /*
         * ======================================
         * 8. 같은 범위 난수 여러 개 출력
         * ======================================
         *
         * 반복문과 함께 많이 사용한다.
         */

        System.out.println("1~6 주사위 값 5번 출력");
        for (int i = 1; i <= 5; i++) {
            int dice = random.nextInt(6) + 1;
            System.out.println(i + "번째 주사위: " + dice);
        }

        /*
         * ======================================
         * 9. 로또 번호 느낌 예제
         * ======================================
         *
         * 1 ~ 45 사이 숫자를 랜덤으로 뽑을 수 있다.
         *
         * 단, 아래 예제는 중복 제거를 하지 않은
         * 가장 기본 형태이다.
         */

        System.out.println("로또 번호 느낌 출력");
        for (int i = 1; i <= 6; i++) {
            int lotto = random.nextInt(45) + 1;
            System.out.println(i + "번 번호: " + lotto);
        }

        /*
         * ======================================
         * 10. seed(시드)란?
         * ======================================
         *
         * Random은 내부적으로 seed 값을 기준으로
         * 난수를 만들어낸다.
         *
         * 같은 seed를 주면
         * 항상 같은 난수 흐름이 만들어진다.
         *
         * 테스트할 때 매우 유용하다.
         */

        Random random1 = new Random(10);
        Random random2 = new Random(10);

        System.out.println("같은 seed 사용 비교");
        System.out.println("random1.nextInt(100) = " + random1.nextInt(100));
        System.out.println("random2.nextInt(100) = " + random2.nextInt(100));

        System.out.println("random1.nextInt(100) = " + random1.nextInt(100));
        System.out.println("random2.nextInt(100) = " + random2.nextInt(100));

        /*
         * ======================================
         * 11. 다른 seed면 결과도 달라진다
         * ======================================
         */

        Random random3 = new Random(5);
        Random random4 = new Random(20);

        System.out.println("다른 seed 사용 비교");
        System.out.println("random3.nextInt(100) = " + random3.nextInt(100));
        System.out.println("random4.nextInt(100) = " + random4.nextInt(100));

        /*
         * ======================================
         * 12. 학생 번호 뽑기 예제
         * ======================================
         *
         * 예:
         * 1번부터 30번까지 학생 중 한 명 랜덤 선택
         */

        int studentNumber = random.nextInt(30) + 1;
        System.out.println("선택된 학생 번호: " + studentNumber);

        /*
         * ======================================
         * 13. 점수 범위 랜덤 만들기
         * ======================================
         *
         * 80 ~ 100 사이 점수 만들기
         *
         * 개수:
         * 100 - 80 + 1 = 21
         *
         * 공식:
         * random.nextInt(개수) + 시작값
         */

        int score = random.nextInt(21) + 80;
        System.out.println("80~100 랜덤 점수: " + score);

        /*
         * ======================================
         * 14. Random 클래스와 Math.random() 차이
         * ======================================
         *
         * Math.random()
         * - 간단하게 난수 하나 만들 때 편리
         *
         * Random 클래스
         * - 다양한 타입 지원
         * - seed 설정 가능
         * - 객체를 만들어 계속 재사용 가능
         */

        double mathRandomValue = Math.random();
        System.out.println("Math.random() = " + mathRandomValue);

        int randomValueFromClass = random.nextInt(10) + 1;
        System.out.println("Random 클래스 1~10 = " + randomValueFromClass);

        /*
         * ======================================
         * 15. Random 클래스 요약
         * ======================================
         *
         * - nextInt()        : 임의의 int 값
         * - nextInt(n)       : 0 ~ n-1 사이 정수
         * - nextDouble()     : 0.0 ~ 1.0 미만 실수
         * - nextBoolean()    : true / false
         * - nextLong()       : 임의의 long 값
         * - new Random(seed) : 고정된 난수 흐름 생성
         *
         * Random 클래스는
         * 게임, 추첨, 테스트 데이터 생성,
         * 임의 값 처리 등에서 자주 사용된다.
         */
    }
}