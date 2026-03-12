package chapter13_generic_wrapper;

public class Generic01_Basic {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. 제네릭(Generic)이란?
         * ===============================
         *
         * 제네릭은
         *
         * "데이터 타입을 나중에 결정하는 문법"
         *
         * 이다.
         *
         * 쉽게 말하면
         *
         * 클래스나 메서드를 만들 때
         * 타입을 미리 정하지 않고
         * 사용할 때 타입을 지정한다.
         *
         * <T> 를 사용해서 타입을 표현한다.
         */


        /*
         * ===============================
         * 2. 제네릭이 없는 경우
         * ===============================
         *
         * Object를 사용하면
         * 모든 타입을 받을 수 있다.
         *
         * 하지만 문제가 있다.
         */

        Box box1 = new Box();

        box1.setValue("Hello");

        String value1 = (String) box1.getValue();

        System.out.println(value1);

        /*
         * 문제점
         *
         * 1. 형변환 필요
         * 2. 타입 안정성이 없음
         */


        /*
         * ===============================
         * 3. 제네릭 사용
         * ===============================
         */

        GenericBox<String> box2 = new GenericBox<>();

        box2.setValue("Java");

        String value2 = box2.getValue();

        System.out.println(value2);

        /*
         * 형변환 필요 없음
         */


        /*
         * ===============================
         * 4. 다른 타입도 가능
         * ===============================
         */

        GenericBox<Integer> box3 = new GenericBox<>();

        box3.setValue(100);

        int value3 = box3.getValue();

        System.out.println(value3);


        /*
         * 제네릭 장점
         *
         * 1. 타입 안정성
         * 2. 형변환 필요 없음
         * 3. 코드 재사용성 증가
         */


        System.out.println("제네릭 기본 예제 종료");

    }

}

/*
 * ===============================
 * Object 사용 클래스
 * ===============================
 */

class Box {

    private Object value;

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

}


/*
 * ===============================
 * 제네릭 클래스
 * ===============================
 */

class GenericBox<T> {

    /*
     * <T>
     *
     * 타입 파라미터
     *
     * 사용자가
     * String
     * Integer
     * Double
     * 등
     * 원하는 타입을 넣을 수 있다.
     */

    private T value;

    public void setValue(T value) {

        this.value = value;

    }

    public T getValue() {

        return value;

    }

}