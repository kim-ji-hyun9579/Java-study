package chapter11_exception;

public class Exception03_Finally {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. finally란 무엇인가?
         * ===============================
         *
         * finally 블록은
         * 예외 발생 여부와 관계없이
         * 항상 실행되는 코드 블록이다.
         *
         * 주로 사용하는 목적
         *
         * - DB 연결 종료
         * - 파일 닫기
         * - 네트워크 연결 종료
         * - 자원 정리
         *
         * 기본 구조
         *
         * try {
         *     위험한 코드
         * }
         * catch(예외타입 e) {
         *     예외 처리
         * }
         * finally {
         *     항상 실행되는 코드
         * }
         */


        /*
         * ===============================
         * 2. 예외가 발생하지 않는 경우
         * ===============================
         */

        try {

            int a = 10;
            int b = 2;

            int result = a / b;

            System.out.println("결과 : " + result);

        } catch (ArithmeticException e) {

            System.out.println("예외 발생");

        } finally {

            System.out.println("finally 실행");

        }

        /*
         * 실행 결과
         *
         * 결과 : 5
         * finally 실행
         */


        /*
         * ===============================
         * 3. 예외가 발생하는 경우
         * ===============================
         */

        try {

            int a = 10;
            int b = 0;

            int result = a / b; // 예외 발생

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("0으로 나눌 수 없습니다.");

        } finally {

            System.out.println("finally 실행");

        }

        /*
         * 실행 결과
         *
         * 0으로 나눌 수 없습니다.
         * finally 실행
         */


        /*
         * ===============================
         * 4. finally 실행 흐름
         * ===============================
         *
         * try 시작
         * ↓
         * 예외 발생 ?
         *
         * YES → catch 실행
         * NO  → catch 건너뜀
         *
         * ↓
         * finally 실행
         *
         * ↓
         * 이후 코드 실행
         */


        System.out.println("프로그램 계속 실행");


        /*
         * ===============================
         * 5. catch 없이 finally 사용
         * ===============================
         *
         * try - finally 구조도 가능하다.
         */

        try {

            System.out.println("try 실행");

        } finally {

            System.out.println("finally 실행");

        }


        /*
         * ===============================
         * 6. finally가 중요한 이유
         * ===============================
         *
         * 예외 발생 여부와 관계없이
         * 반드시 실행되어야 하는 코드가 존재한다.
         *
         * 대표적인 예
         *
         * - DB Connection close()
         * - File close()
         * - Socket close()
         *
         */


        /*
         * ===============================
         * 7. 실무 예제 (자원 정리)
         * ===============================
         */

        try {

            System.out.println("파일 열기");

            int num = 10 / 0; // 예외 발생

        } catch (Exception e) {

            System.out.println("예외 처리");

        } finally {

            System.out.println("파일 닫기");

        }


        /*
         * 실행 흐름
         *
         * 파일 열기
         * 예외 처리
         * 파일 닫기
         */


        /*
         * ===============================
         * 8. finally 특징
         * ===============================
         *
         * 예외 발생 여부와 관계없이 실행
         * try / catch 뒤에 작성
         * 자원 정리에 사용
         * 프로그램 안정성 증가
         */


        /*
         * ===============================
         * 9. finally 요약
         * ===============================
         *
         * - finally는 항상 실행된다.
         * - 예외 발생 여부와 관계 없다.
         * - 자원 정리 코드에 사용된다.
         * - 실무에서 매우 중요하다.
         */

    }
}