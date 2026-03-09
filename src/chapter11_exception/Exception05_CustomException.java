package chapter11_exception;

public class Exception05_CustomException {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. 사용자 정의 예외란?
         * ===============================
         *
         * Java에는 기본 예외가 많지만
         * 프로그램 로직에 맞는 예외를
         * 직접 만들 수 있다.
         *
         * 예시
         *
         * - 나이 제한 예외
         * - 로그인 실패 예외
         * - 잔액 부족 예외
         *
         * 이런 비즈니스 로직 오류는
         * 직접 예외 클래스를 만들어 사용한다.
         */


        /*
         * ===============================
         * 2. 사용자 정의 예외 구조
         * ===============================
         *
         * class CustomException extends Exception
         *
         * 또는
         *
         * class CustomException extends RuntimeException
         */


        /*
         * ===============================
         * 3. 사용자 정의 예외 사용
         * ===============================
         */

        try {

            checkAge(15);

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }


        /*
         * 실행 결과
         *
         * 18세 이상만 가입 가능합니다.
         */


        /*
         * ===============================
         * 4. 정상 케이스
         * ===============================
         */

        try {

            checkAge(25);

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }


        /*
         * 실행 결과
         *
         * 가입 가능
         */


        /*
         * ===============================
         * 5. 사용자 정의 예외 사용하는 이유
         * ===============================
         *
         * 코드 가독성 증가
         * 비즈니스 로직 명확
         * 예외 관리 쉬움
         */


        /*
         * ===============================
         * 6. Custom Exception 요약
         * ===============================
         *
         * - Exception 클래스를 상속하여 만든다.
         * - 프로그램 규칙 위반을 표현할 수 있다.
         * - throw로 발생시킨다.
         * - try-catch로 처리한다.
         */
    }


    /*
     * ===============================
     * 사용자 정의 예외 클래스
     * ===============================
     */

    static class InvalidAgeException extends Exception {

        public InvalidAgeException(String message) {

            super(message);

        }

    }



    /*
     * ===============================
     * 예외 발생 메서드
     * ===============================
     */

    public static void checkAge(int age) throws InvalidAgeException {

        if(age < 18) {

            throw new InvalidAgeException("18세 이상만 가입 가능합니다.");

        }

        System.out.println("가입 가능");

    }

}