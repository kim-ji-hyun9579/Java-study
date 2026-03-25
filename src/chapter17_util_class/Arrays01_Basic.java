package chapter17_util_class;

import java.util.Arrays;

public class Arrays01_Basic {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. Arrays 클래스란?
         * ======================================
         *
         * Arrays 클래스는 배열을 다루기 위한 유틸 클래스이다.
         *
         * 배열 출력, 정렬, 비교, 복사, 검색 등
         * 자주 사용하는 기능들을 메서드로 제공한다.
         *
         * 주의:
         * Arrays는 배열(array)을 위한 클래스이고,
         * ArrayList와는 다르다.
         */

        /*
         * ======================================
         * 2. 배열을 그냥 출력하면?
         * ======================================
         *
         * 배열 변수만 출력하면
         * 배열의 주소 형태 비슷한 값이 나온다.
         *
         * 그래서 실제 내용 확인을 위해
         * Arrays.toString()을 많이 사용한다.
         */

        int[] arr1 = {10, 20, 30, 40, 50};

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        /*
         * ======================================
         * 3. Arrays.toString()
         * ======================================
         *
         * 1차원 배열의 실제 값을 문자열로 보기 좋게 출력한다.
         */

        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("원본 배열: " + Arrays.toString(numbers));

        /*
         * ======================================
         * 4. Arrays.sort()
         * ======================================
         *
         * 배열을 오름차순으로 정렬한다.
         *
         * 정렬 후에는 원본 배열 자체가 바뀐다.
         */

        Arrays.sort(numbers);
        System.out.println("정렬 후 배열: " + Arrays.toString(numbers));

        /*
         * ======================================
         * 5. Arrays.binarySearch()
         * ======================================
         *
         * 특정 값의 위치(index)를 빠르게 찾는다.
         *
         * 단, 이 메서드는 반드시 정렬된 배열에서 사용해야 한다.
         *
         * 찾는 값이 있으면 해당 index 반환
         * 없으면 음수 반환
         */

        int index1 = Arrays.binarySearch(numbers, 8);
        int index2 = Arrays.binarySearch(numbers, 100);

        System.out.println("숫자 8의 위치: " + index1);
        System.out.println("숫자 100의 위치: " + index2);

        /*
         * ======================================
         * 6. Arrays.copyOf()
         * ======================================
         *
         * 배열 전체 또는 지정한 길이만큼 복사한다.
         *
         * 원본과는 별개의 새로운 배열이 만들어진다.
         */

        int[] copy1 = Arrays.copyOf(numbers, numbers.length);
        System.out.println("전체 복사 배열: " + Arrays.toString(copy1));

        int[] copy2 = Arrays.copyOf(numbers, 3);
        System.out.println("앞에서 3개만 복사: " + Arrays.toString(copy2));

        /*
         * ======================================
         * 7. Arrays.copyOfRange()
         * ======================================
         *
         * 시작 index부터 끝 index 직전까지 복사한다.
         *
         * 형식:
         * Arrays.copyOfRange(배열명, 시작인덱스, 끝인덱스)
         *
         * 끝인덱스는 포함하지 않는다.
         */

        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("일부 구간 복사: " + Arrays.toString(rangeCopy));

        /*
         * ======================================
         * 8. Arrays.fill()
         * ======================================
         *
         * 배열의 모든 요소를 같은 값으로 채운다.
         */

        int[] scores = new int[5];
        Arrays.fill(scores, 100);
        System.out.println("fill 후 배열: " + Arrays.toString(scores));

        /*
         * ======================================
         * 9. Arrays.equals()
         * ======================================
         *
         * 두 배열의 내용이 같은지 비교한다.
         *
         * 배열은 == 로 비교하면 주소 비교가 되므로
         * 내용 비교는 Arrays.equals()를 많이 사용한다.
         */

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};

        System.out.println("a와 b가 같은가? " + Arrays.equals(a, b));
        System.out.println("a와 c가 같은가? " + Arrays.equals(a, c));

        /*
         * ======================================
         * 10. 다차원 배열 출력
         * ======================================
         *
         * 2차원 배열 이상은 Arrays.toString()으로 출력하면
         * 내부 배열 주소처럼 보여서 보기 불편하다.
         *
         * 이때는 Arrays.deepToString()을 사용한다.
         */

        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));

        /*
         * ======================================
         * 11. 배열 정렬 전/후 비교 예제
         * ======================================
         *
         * Arrays.sort()는 원본 배열을 직접 바꾸므로
         * 정렬 전 상태를 유지하고 싶다면
         * 먼저 복사해두는 것이 좋다.
         */

        int[] original = {4, 1, 7, 3};
        int[] sorted = Arrays.copyOf(original, original.length);

        Arrays.sort(sorted);

        System.out.println("원본 배열: " + Arrays.toString(original));
        System.out.println("정렬 배열: " + Arrays.toString(sorted));

        /*
         * ======================================
         * 12. Arrays 클래스 요약
         * ======================================
         *
         * - toString()      : 1차원 배열 출력
         * - deepToString()  : 다차원 배열 출력
         * - sort()          : 배열 정렬
         * - binarySearch()  : 값 검색(정렬된 배열 필요)
         * - copyOf()        : 배열 복사
         * - copyOfRange()   : 배열 일부 복사
         * - fill()          : 배열 값 채우기
         * - equals()        : 배열 내용 비교
         *
         * Arrays 클래스는 배열 실습에서 매우 자주 사용된다.
         */
    }
}