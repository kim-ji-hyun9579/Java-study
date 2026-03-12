package chapter13_generic_wrapper;

public class Generic02_Method {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. 제네릭 메서드란?
         * ===============================
         *
         * 메서드에서
         * 타입을 제네릭으로 받는 방법이다.
         *
         * 형식
         *
         * public <T> 반환타입 메서드명(T 변수)
         */

        GenericMethod gm = new GenericMethod();

        gm.print("Hello Java");

        gm.print(100);

        gm.print(3.14);

        /*
         * 하나의 메서드로
         *
         * String
         * Integer
         * Double
         *
         * 모두 처리 가능
         */


        /*
         * ===============================
         * 2. 반환값이 있는 제네릭 메서드
         * ===============================
         */

        String result1 = gm.returnValue("제네릭");

        Integer result2 = gm.returnValue(999);

        System.out.println(result1);
        System.out.println(result2);


        /*
         * ===============================
         * 3. static 제네릭 메서드
         * ===============================
         */

        GenericMethod.staticPrint("Static Generic");

        GenericMethod.staticPrint(777);


        /*
         * ===============================
         * 4. 제네릭 메서드 특징
         * ===============================
         *
         * 클래스가 제네릭이 아니어도
         * 메서드는 제네릭 가능
         */


        System.out.println("제네릭 메서드 예제 종료");

    }

}


/*
 * ===============================
 * 제네릭 메서드 클래스
 * ===============================
 */

class GenericMethod {


    /*
     * ===============================
     * 1. 기본 제네릭 메서드
     * ===============================
     */

    public <T> void print(T value) {

        System.out.println("값 : " + value);

    }


    /*
     * ===============================
     * 2. 반환값 제네릭 메서드
     * ===============================
     */

    public <T> T returnValue(T value) {

        return value;

    }


    /*
     * ===============================
     * 3. static 제네릭 메서드
     * ===============================
     */

    public static <T> void staticPrint(T value) {

        System.out.println("Static 값 : " + value);

    }

}