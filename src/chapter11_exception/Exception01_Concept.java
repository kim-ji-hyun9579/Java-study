package chapter11_exception;

public class Exception01_Concept {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. 예외(Exception)란 무엇인가?
         * ===============================
         *
         * 프로그램 실행 중 발생하는
         * "비정상적인 상황"을 의미한다.
         *
         * 예시
         *
         * - 0으로 나누기
         * - 존재하지 않는 배열 접근
         * - 파일이 존재하지 않음
         * - null 객체 사용
         *
         * 이런 상황이 발생하면
         * JVM이 프로그램 실행을 중단한다.
         */


        /*
         * ===============================
         * 2. 예외 발생 예시
         * ===============================
         */

        int a = 10;
        int b = 0;

        // ArithmeticException 발생
        // System.out.println(a / b);


        /*
         * 실행 시 발생하는 에러
         *
         * Exception in thread "main"
         * java.lang.ArithmeticException: / by zero
         */


        /*
         * ===============================
         * 3. 예외가 발생하면?
         * ===============================
         *
         * JVM 동작 흐름
         *
         * 1. 예외 발생
         * 2. JVM이 예외 객체 생성
         * 3. Stack Trace 출력
         * 4. 프로그램 종료
         */

        System.out.println("프로그램 시작");

        int num1 = 10;
        int num2 = 0;

        // 예외 발생 지점
        // int result = num1 / num2;

        System.out.println("프로그램 종료");


        /*
         * 위 코드 실행 시
         *
         * 프로그램 시작
         * Exception 발생
         * 프로그램 종료 출력되지 않음
         */


        /*
         * ===============================
         * 4. 예외 종류
         * ===============================
         *
         * Java 예외는 크게 두 가지다.
         *
         * 1️. Checked Exception
         * 컴파일 단계에서 확인되는 예외
         *
         * 예시
         * IOException
         * SQLException
         *
         * 반드시 처리해야 한다.
         */


        /*
         * 2️. Unchecked Exception
         *
         * 실행 중 발생하는 예외
         * RuntimeException 계열
         *
         * 예시
         *
         * ArithmeticException : 나누기 0 하면 발생
         * NullPointerException : 실제 값이 아닌 null 호출 시
         * ArrayIndexOutOfBoundsException : index가 유효한 범위를 벗어날 시
         */


        /*
         * ===============================
         * 5. 예외 계층 구조
         * ===============================
         *
         * Java Exception 구조
         *
         * Object
         *   └ Throwable
         *        ├ Error
         *        └ Exception
         *              └ RuntimeException
         *
         * Error
         * → JVM 문제 (개발자가 처리 불가)
         *
         * Exception
         * → 개발자가 처리 가능
         */


        /*
         * ===============================
         * 6. 예외를 처리하는 이유
         * ===============================
         *
         * 예외 처리를 하지 않으면
         * 프로그램이 강제 종료된다.
         *
         * 예외 처리를 하면
         *
         * 프로그램 안정성 증가
         * 사용자에게 메시지 제공
         * 시스템 장애 방지
         */


        /*
         * ===============================
         * 7. 예외 처리 방법
         * ===============================
         *
         * Java 예외 처리 방법
         *
         * 1️. try - catch
         * 2️. finally
         * 3️. throw
         * 4️. throws
         * 5️. 사용자 정의 예외
         *
         * 다음 클래스에서 하나씩 학습한다.
         */


        /*
         * ===============================
         * 8. 예외 개념 요약
         * ===============================
         *
         * - 예외는 프로그램 실행 중 발생하는 오류
         * - 예외가 발생하면 JVM이 프로그램을 종료
         * - 예외 처리를 통해 프로그램 안정성 확보
         * - Java는 예외 객체(Exception Object)를 사용
         */
    }
}