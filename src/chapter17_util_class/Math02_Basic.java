package chapter17_util_class;

public class Math02_Basic {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. Math 클래스란?
         * ======================================
         *
         * Math 클래스는 수학 계산에 자주 사용하는 기능들을
         * 메서드로 제공하는 유틸 클래스이다.
         *
         * 예:
         * - 절대값
         * - 최댓값 / 최솟값
         * - 거듭제곱
         * - 제곱근
         * - 반올림 / 올림 / 버림
         * - 랜덤 숫자
         *
         * Math 클래스는 객체를 생성하지 않고 사용한다.
         * 즉, static 메서드로 바로 호출한다.
         *
         * 예:
         * Math.abs(-10)
         * Math.max(3, 7)
         */

        /*
         * ======================================
         * 2. Math.abs()
         * ======================================
         *
         * abs는 absolute의 약자이며,
         * 절대값을 구하는 메서드이다.
         *
         * 음수는 양수로 바뀌고,
         * 양수는 그대로 유지된다.
         */

        int num1 = -10;
        int num2 = 20;

        System.out.println("Math.abs(-10) = " + Math.abs(num1));
        System.out.println("Math.abs(20) = " + Math.abs(num2));

        /*
         * ======================================
         * 3. Math.max(), Math.min()
         * ======================================
         *
         * 두 값 중 큰 값 / 작은 값을 구한다.
         */

        int a = 15;
        int b = 27;

        System.out.println("Math.max(15, 27) = " + Math.max(a, b));
        System.out.println("Math.min(15, 27) = " + Math.min(a, b));

        /*
         * ======================================
         * 4. Math.pow()
         * ======================================
         *
         * 거듭제곱을 구한다.
         *
         * 형식:
         * Math.pow(밑, 지수)
         *
         * 반환형은 double이다.
         */

        double powResult = Math.pow(2, 3);
        System.out.println("Math.pow(2, 3) = " + powResult);

        /*
         * ======================================
         * 5. Math.sqrt()
         * ======================================
         *
         * 제곱근을 구한다.
         *
         * 예:
         * Math.sqrt(25) -> 5.0
         */

        double sqrtResult = Math.sqrt(25);
        System.out.println("Math.sqrt(25) = " + sqrtResult);

        /*
         * ======================================
         * 6. Math.round()
         * ======================================
         *
         * 반올림을 수행한다.
         *
         * 주의:
         * 반환형이 float이면 int,
         * double이면 long 결과가 나온다.
         */

        double d1 = 3.14;
        double d2 = 3.76;

        System.out.println("Math.round(3.14) = " + Math.round(d1));
        System.out.println("Math.round(3.76) = " + Math.round(d2));

        /*
         * ======================================
         * 7. Math.ceil(), Math.floor()
         * ======================================
         *
         * ceil  : 올림
         * floor : 버림
         *
         * 둘 다 반환형은 double이다.
         */

        double d3 = 3.14;
        double d4 = 3.99;

        System.out.println("Math.ceil(3.14) = " + Math.ceil(d3));
        System.out.println("Math.floor(3.99) = " + Math.floor(d4));

        /*
         * ======================================
         * 8. Math.random()
         * ======================================
         *
         * 0.0 이상 1.0 미만의 난수를 반환한다.
         *
         * 예:
         * 0.12345
         * 0.98765
         *
         * 보통 원하는 범위의 정수로 변환해서 많이 사용한다.
         */

        double randomValue = Math.random();
        System.out.println("Math.random() = " + randomValue);

        /*
         * ======================================
         * 9. Math.random()으로 정수 범위 만들기
         * ======================================
         *
         * 1 ~ 10 사이 정수 만들기:
         *
         * (int)(Math.random() * 10) + 1
         *
         * 설명:
         * Math.random() * 10 -> 0.0 ~ 9.999...
         * (int)로 형변환 -> 0 ~ 9
         * +1 -> 1 ~ 10
         */

        int randomInt = (int)(Math.random() * 10) + 1;
        System.out.println("1~10 랜덤 정수 = " + randomInt);

        /*
         * ======================================
         * 10. Math.PI
         * ======================================
         *
         * 원주율 값을 상수로 제공한다.
         */

        System.out.println("Math.PI = " + Math.PI);

        /*
         * ======================================
         * 11. 원의 넓이 계산 예제
         * ======================================
         *
         * 원의 넓이 = 반지름 * 반지름 * PI
         */

        double radius = 5.0;
        double circleArea = radius * radius * Math.PI;

        System.out.println("반지름이 5인 원의 넓이 = " + circleArea);

        /*
         * ======================================
         * 12. 실무 느낌 예제 - 점수 처리
         * ======================================
         *
         * 소수점이 포함된 평균 점수를
         * 반올림 / 올림 / 버림으로 비교해볼 수 있다.
         */

        double average = 87.56;

        System.out.println("원본 평균 = " + average);
        System.out.println("반올림 = " + Math.round(average));
        System.out.println("올림 = " + Math.ceil(average));
        System.out.println("버림 = " + Math.floor(average));

        /*
         * ======================================
         * 13. Math 클래스 요약
         * ======================================
         *
         * - abs()    : 절대값
         * - max()    : 최댓값
         * - min()    : 최솟값
         * - pow()    : 거듭제곱
         * - sqrt()   : 제곱근
         * - round()  : 반올림
         * - ceil()   : 올림
         * - floor()  : 버림
         * - random() : 난수
         * - PI       : 원주율 상수
         *
         * Math 클래스는 객체 생성 없이
         * 클래스명으로 바로 호출해서 사용한다.
         */
    }
}