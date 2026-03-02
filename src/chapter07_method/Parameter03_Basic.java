package chapter07_method;

public class Parameter03_Basic {

    public static void main(String[] args) {

        /*
         * ==================================================
         * 1. 메서드 오버로딩이란?
         * ==================================================
         *
         * - 같은 이름의 메서드를 여러 개 정의
         * - 매개변수의 개수 or 타입이 달라야 한다
         * - 기능은 비슷하지만 입력값이 다른 경우 사용
         */

        /*
         * ==================================================
         * 2. 오버로딩 메서드 호출
         * ==================================================
         */
        print(10);
        print("Hello");
        print(3, 5);
        print(2.5, 4.5);

        /*
         * ==================================================
         * 3. 오버로딩 + return
         * ==================================================
         */
        int sum1 = add(10, 20);
        double sum2 = add(1.5, 2.5);

        System.out.println("int add 결과 : " + sum1);
        System.out.println("double add 결과 : " + sum2);
    }

    /*
     * ==================================================
     * 2-1. 같은 이름, 다른 매개변수 (타입)
     * ==================================================
     */
    public static void print(int num) {
        System.out.println("int 출력 : " + num);
    }

    public static void print(String text) {
        System.out.println("String 출력 : " + text);
    }

    /*
     * ==================================================
     * 2-2. 같은 이름, 다른 매개변수 (개수)
     * ==================================================
     */
    public static void print(int a, int b) {
        System.out.println("두 수 출력 : " + a + ", " + b);
    }

    public static void print(double a, double b) {
        System.out.println("double 두 수 출력 : " + a + ", " + b);
    }

    /*
     * ==================================================
     * 3-1. return 메서드 오버로딩
     * ==================================================
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}