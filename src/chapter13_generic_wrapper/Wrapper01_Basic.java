package chapter13_generic_wrapper;

public class Wrapper01_Basic {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. Wrapper 클래스란?
         * ===============================
         *
         * Java는
         *
         * 기본 자료형(Primitive Type)을
         * 객체(Object)로 사용할 수 있도록
         * Wrapper 클래스를 제공한다.
         *
         * 예
         *
         * int  → Integer
         * double → Double
         * char → Character
         * boolean → Boolean
         */


        /*
         * ===============================
         * 2. 기본형 변수
         * ===============================
         */

        int num1 = 10;

        double num2 = 3.14;

        char ch = 'A';

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(ch);


        /*
         * ===============================
         * 3. Wrapper 객체
         * ===============================
         */

        Integer num3 = new Integer(100);

        Double num4 = new Double(9.99);

        Character ch2 = new Character('B');

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(ch2);


        /*
         * ===============================
         * 4. Wrapper 클래스 사용하는 이유
         * ===============================
         *
         * 이유 1
         *
         * Collection Framework는
         * 기본형을 저장할 수 없다.
         *
         * 예
         *
         * ArrayList<int> X
         *
         * ArrayList<Integer> O
         */


        /*
         * ===============================
         * 5. Wrapper 클래스 주요 메서드
         * ===============================
         */

        Integer num5 = Integer.valueOf(200);

        int result = num5.intValue();

        System.out.println("Wrapper 값 : " + num5);
        System.out.println("기본형 값 : " + result);


        /*
         * ===============================
         * 6. 문자열 → 숫자 변환
         * ===============================
         */

        String str = "500";

        int number = Integer.parseInt(str);

        System.out.println("문자열 숫자 : " + number);


        /*
         * ===============================
         * 7. Wrapper 클래스 종류
         * ===============================
         */

        /*
         * byte    → Byte
         * short   → Short
         * int     → Integer
         * long    → Long
         * float   → Float
         * double  → Double
         * char    → Character
         * boolean → Boolean
         */

    }

}