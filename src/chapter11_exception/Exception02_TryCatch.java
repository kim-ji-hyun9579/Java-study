package chapter11_exception;

public class Exception02_TryCatch {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. try-catch란 무엇인가?
         * ===============================
         *
         * 예외가 발생할 가능성이 있는 코드를
         * try 블록 안에 작성하고
         *
         * 예외가 발생했을 때 처리할 코드를
         * catch 블록에 작성한다.
         *
         * 기본 구조
         *
         * try {
         *     예외 발생 가능 코드
         * }
         * catch(예외타입 변수) {
         *     예외 처리 코드
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

            System.out.println("0으로 나눌 수 없습니다.");

        }

        /*
         * 실행 결과
         *
         * 결과 : 5
         *
         * 예외가 발생하지 않았기 때문에
         * catch 블록은 실행되지 않는다.
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

            System.out.println("예외 발생!");
            System.out.println("0으로 나눌 수 없습니다.");

        }

        /*
         * 실행 결과
         *
         * 예외 발생!
         * 0으로 나눌 수 없습니다.
         *
         * 프로그램이 종료되지 않고
         * 정상적으로 다음 코드 실행
         */


        /*
         * ===============================
         * 4. Exception 객체 정보
         * ===============================
         *
         * catch 블록의 e는
         * Exception 객체이다.
         */

        try {

            int[] arr = {1,2,3};

            System.out.println(arr[5]); // 예외 발생

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("배열 범위 초과!");

            // 예외 메시지 출력
            System.out.println("메세지 " + e.getMessage());

            // 예외 타입 출력
            System.out.println("예외 타입 " + e.toString());

        }


        /*
         * ===============================
         * 5. Exception Stack Trace
         * ===============================
         *
         * 예외가 발생한 위치를
         * 자세하게 출력할 수 있다.
         */

        try {

            String str = null;

            str.length(); // NullPointerException

        } catch (NullPointerException e) {

            System.out.println("Null 객체 사용 오류");

            e.printStackTrace();

        }


        /*
         * ===============================
         * 6. 다중 catch
         * ===============================
         *
         * 하나의 try 블록에서
         * 여러 종류의 예외를 처리할 수 있다.
         */

        try {

            int[] arr = {1,2,3};

            System.out.println(arr[5]); // 배열 예외

            int num = 10 / 0; // 수학 예외

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("배열 범위 오류");

        }

        catch (ArithmeticException e) {

            System.out.println("0으로 나누기 오류");

        }


        /*
         * ===============================
         * 7. Exception 부모로 처리
         * ===============================
         *
         * 모든 예외의 부모 클래스는
         *
         * Exception
         */

        try {

            int[] arr = {1,2,3};

            System.out.println(arr[5]);

        } catch (Exception e) {

            System.out.println("예외 발생");

        }

        /*
         * 하지만 실제 개발에서는
         * 구체적인 예외를 먼저 처리하는 것이 좋다.
         */


        /*
         * ===============================
         * 8. try-catch 실행 흐름
         * ===============================
         *
         * try {
         *   1
         *   2
         *   3 ← 예외 발생
         *   4 (실행 안됨)
         * }
         * catch {
         *   예외 처리
         * }
         *
         * 이후 프로그램 계속 실행
         */


        System.out.println("프로그램 정상 종료");


        /*
         * ===============================
         * 9. try-catch 요약
         * ===============================
         *
         * - 예외 발생 가능 코드는 try 블록에 작성
         * - 예외 발생 시 catch 블록 실행
         * - 프로그램이 종료되지 않고 계속 실행
         * - catch는 여러 개 작성 가능
         * - Exception은 모든 예외의 부모
         */
    }
}