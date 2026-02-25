package chapter03_operator;

public class Operator04_Assignment {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. 증감 연산자란?
         * ===============================
         *
         * 값을 1씩 증가 또는 감소시키는 연산자
         *
         * ++ : 1 증가
         * -- : 1 감소
         */

        int a = 10;

        a++;
        System.out.println(a); // 11

        a--;
        System.out.println(a); // 10

        /*
         * ===============================
         * 2. 전위 / 후위 증감
         * ===============================
         *
         * ++a : 전위 증가 (먼저 증가)
         * a++ : 후위 증가 (나중에 증가)
         */

        int x = 5;

        System.out.println(++x); // 6
        System.out.println(x);   // 6

        int y = 5;

        System.out.println(y++); // 5
        System.out.println(y);   // 6

        /*
         * ===============================
         * 3. 증감 연산자 주의사항
         * ===============================
         */

        int n = 10;

        int result1 = n++;
        System.out.println(result1); // 10
        System.out.println(n);       // 11

        int result2 = ++n;
        System.out.println(result2); // 12
        System.out.println(n);       // 12

        /*
         * ===============================
         * 4. 대입 연산자란?
         * ===============================
         *
         * =  : 대입
         * += : 더해서 대입
         * -= : 빼서 대입
         * *= : 곱해서 대입
         * /= : 나눠서 대입
         * %= : 나머지 대입
         */

        int value = 10;

        value += 5; // value = value + 5
        System.out.println(value); // 15

        value -= 3; // value = value - 3
        System.out.println(value); // 12

        value *= 2; // value = value * 2
        System.out.println(value); // 24

        value /= 4; // value = value / 4
        System.out.println(value); // 6

        value %= 4; // value = value % 4
        System.out.println(value); // 2


        /*
         * ===============================
         * 5. 증감 연산자 요약
         * ===============================
         *
         * - ++ / -- 은 1씩 증가 / 감소
         * - 전위(++a) : 먼저 증가 후 사용
         * - 후위(a++) : 먼저 사용 후 증가
         * - 반복문(for)에서 핵심적으로 사용
         */

        /*
         * ===============================
         * 6. 대입 연산자 요약
         * ===============================
         *
         * - 연산 + 대입을 한 줄로 표현
         * - 코드 간결 + 가독성 증가
         * - 실무에서 매우 자주 사용
         */
    }
}