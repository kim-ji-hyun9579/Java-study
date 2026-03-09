package chapter11_exception;

public class Exception04_ThrowThrows {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. throw란 무엇인가?
         * ===============================
         *
         * throw는
         * 개발자가 직접 예외를 발생시키는 키워드이다.
         *
         * JVM이 예외를 만드는 것이 아니라
         * 개발자가 예외를 강제로 발생시킨다.
         *
         * 기본 구조
         *
         * throw new 예외객체
         */

        try {

            int age = -10;

            if(age < 0) {

                throw new IllegalArgumentException("나이는 음수가 될 수 없습니다.");

            }

            System.out.println("나이 : " + age);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }


        /*
         * 실행 결과
         *
         * 나이는 음수가 될 수 없습니다.
         */


        /*
         * ===============================
         * 2. throw 실행 흐름
         * ===============================
         *
         * 코드 실행
         * ↓
         * 조건 검사
         * ↓
         * throw 발생
         * ↓
         * catch 블록으로 이동
         */


        /*
         * ===============================
         * 3. throws란 무엇인가?
         * ===============================
         *
         * throws는
         * 예외를 처리하지 않고
         * 호출한 메서드에게 떠넘기는 것이다.
         *
         * 즉
         *
         * "이 메서드는 예외가 발생할 수 있으니
         * 호출한 쪽에서 처리하세요"
         */


        /*
         * ===============================
         * 4. throws 예제
         * ===============================
         */

        try {

            method1();

        } catch (Exception e) {

            System.out.println("예외 처리 완료");

        }


        /*
         * 실행 흐름
         *
         * main
         * ↓
         * method1()
         * ↓
         * 예외 발생
         * ↓
         * main으로 전달
         * ↓
         * catch 처리
         */


        /*
         * ===============================
         * 5. throw + throws 함께 사용
         * ===============================
         */

        try {

            checkAge(-5);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }


        /*
         * ===============================
         * 6. throw / throws 차이
         * ===============================
         *
         * throw
         * → 예외 발생
         *
         * throws
         * → 예외 위임
         *
         */


        /*
         * ===============================
         * 7. throw 사용 목적
         * ===============================
         *
         * 잘못된 값 방지
         * 비즈니스 규칙 검사
         * 개발자가 예외 상황 정의
         *
         */


        /*
         * ===============================
         * 8. throw / throws 요약
         * ===============================
         *
         * throw
         * → 예외 직접 발생
         *
         * throws
         * → 예외를 호출한 곳으로 전달
         *
         */
    }



    /*
     * ===============================
     * throws 예제 메서드
     * ===============================
     */

    public static void method1() throws Exception {

        System.out.println("method1 실행");

        throw new Exception("강제 예외 발생");

    }



    /*
     * ===============================
     * throw + throws 예제
     * ===============================
     */

    public static void checkAge(int age) throws Exception {

        if(age < 0) {

            throw new Exception("나이는 음수 불가");

        }

        System.out.println("나이 : " + age);

    }

}