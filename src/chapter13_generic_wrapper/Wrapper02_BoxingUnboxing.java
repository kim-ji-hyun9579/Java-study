package chapter13_generic_wrapper;

public class Wrapper02_BoxingUnboxing {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. Boxing 이란?
         * ===============================
         *
         * 기본형 데이터를
         * Wrapper 객체로 변환하는 것을
         *
         * Boxing 이라고 한다.
         */

        int num1 = 10;

        Integer obj1 = Integer.valueOf(num1);

        System.out.println("Boxing 결과 : " + obj1);



        /*
         * ===============================
         * 2. Unboxing 이란?
         * ===============================
         *
         * Wrapper 객체를
         * 기본형 데이터로 변환하는 것을
         *
         * Unboxing 이라고 한다.
         */

        Integer obj2 = Integer.valueOf(200);

        int num2 = obj2.intValue();

        System.out.println("Unboxing 결과 : " + num2);



        /*
         * ===============================
         * 3. Auto Boxing
         * ===============================
         *
         * Java는 자동으로
         * 기본형 → Wrapper 변환을 해준다.
         */

        Integer obj3 = 300; // 자동 Boxing

        System.out.println("Auto Boxing : " + obj3);



        /*
         * ===============================
         * 4. Auto Unboxing
         * ===============================
         *
         * Wrapper → 기본형
         * 자동 변환
         */

        Integer obj4 = 400;

        int num4 = obj4; // 자동 Unboxing

        System.out.println("Auto Unboxing : " + num4);



        /*
         * ===============================
         * 5. Collection에서 사용 예
         * ===============================
         *
         * Collection은
         * 기본형을 저장할 수 없다.
         *
         * 그래서 Wrapper를 사용한다.
         */

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(10); // Auto Boxing
        list.add(20);
        list.add(30);

        int value = list.get(0); // Auto Unboxing

        System.out.println("ArrayList 값 : " + value);



        /*
         * ===============================
         * 6. Boxing / Unboxing 흐름
         * ===============================
         *
         * int → Integer
         * Integer → int
         *
         * Java가 자동 변환
         */

    }

}