package chapter17_util_class;

import java.util.Arrays;

public class System04_Basic {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. System 클래스란?
         * ======================================
         *
         * System 클래스는 자바 프로그램 실행 환경과 관련된
         * 기능을 제공하는 유틸 클래스이다.
         *
         * 대표적으로 많이 사용하는 기능:
         * - 표준 출력 : System.out.println()
         * - 표준 에러 출력 : System.err.println()
         * - 표준 입력 : System.in
         * - 현재 시간 측정 : System.currentTimeMillis(), System.nanoTime()
         * - 배열 복사 : System.arraycopy()
         * - 프로그램 종료 : System.exit()
         * - 환경 변수 확인 : System.getenv()
         * - 시스템 속성 확인 : System.getProperty()
         *
         * System 클래스도 Math처럼 객체를 생성하지 않고
         * static으로 바로 사용한다.
         */

        /*
         * ======================================
         * 2. System.out.println()
         * ======================================
         *
         * 가장 많이 사용하는 표준 출력문이다.
         *
         * 콘솔 창에 일반 메시지를 출력할 때 사용한다.
         */

        System.out.println("일반 출력입니다.");
        System.out.println("System.out.println()은 표준 출력이다.");

        /*
         * ======================================
         * 3. System.err.println()
         * ======================================
         *
         * 에러 메시지를 출력할 때 사용한다.
         *
         * 일반 출력과 구분해서 오류 상황을 표현할 때 사용한다.
         */

        System.err.println("이 문장은 에러 출력입니다.");

        /*
         * ======================================
         * 4. System.currentTimeMillis()
         * ======================================
         *
         * 1970년 1월 1일 00:00:00 UTC부터 현재까지의 시간을
         * 밀리초(ms) 단위로 반환한다.
         *
         * 주로 실행 시간 측정에 사용한다.
         */

        long currentMillis = System.currentTimeMillis();
        System.out.println("현재 밀리초 시간: " + currentMillis);

        /*
         * ======================================
         * 5. 실행 시간 측정 예제
         * ======================================
         *
         * 코드 실행 전후 시간을 구해서
         * 얼마나 걸렸는지 계산할 수 있다.
         */

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 1000000; i++) {
            int result = i * 2;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("실행 시간(ms): " + (endTime - startTime));

        /*
         * ======================================
         * 6. System.nanoTime()
         * ======================================
         *
         * 더 정밀한 시간 측정을 위해 사용한다.
         *
         * 나노초(ns) 단위로 측정한다.
         *
         * 성능 측정에서는 currentTimeMillis()보다
         * nanoTime()을 더 자주 사용한다.
         */

        long nanoStart = System.nanoTime();

        for (int i = 1; i <= 1000000; i++) {
            int result = i + 10;
        }

        long nanoEnd = System.nanoTime();

        System.out.println("실행 시간(ns): " + (nanoEnd - nanoStart));

        /*
         * ======================================
         * 7. System.arraycopy()
         * ======================================
         *
         * 배열의 일부를 빠르게 복사하는 메서드이다.
         *
         * 형식:
         * System.arraycopy(원본배열, 원본시작위치, 대상배열, 대상시작위치, 복사개수)
         */

        int[] source = {10, 20, 30, 40, 50};
        int[] target = new int[5];

        System.arraycopy(source, 0, target, 0, source.length);

        System.out.println("원본 배열: " + Arrays.toString(source));
        System.out.println("복사 배열: " + Arrays.toString(target));

        /*
         * ======================================
         * 8. 배열 일부만 복사하기
         * ======================================
         *
         * source의 index 1부터 3개를
         * target2의 index 0부터 복사한다.
         */

        int[] target2 = new int[3];
        System.arraycopy(source, 1, target2, 0, 3);

        System.out.println("부분 복사 배열: " + Arrays.toString(target2));

        /*
         * ======================================
         * 9. System.getProperty()
         * ======================================
         *
         * 자바 시스템 속성 값을 가져온다.
         *
         * 예:
         * - 운영체제 이름
         * - 자바 버전
         * - 사용자 이름
         * - 작업 디렉토리
         */

        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");
        String userName = System.getProperty("user.name");
        String userDir = System.getProperty("user.dir");

        System.out.println("운영체제 이름: " + osName);
        System.out.println("자바 버전: " + javaVersion);
        System.out.println("사용자 이름: " + userName);
        System.out.println("현재 작업 경로: " + userDir);

        /*
         * ======================================
         * 10. System.getenv()
         * ======================================
         *
         * 운영체제의 환경 변수 값을 가져온다.
         *
         * 환경 변수는 OS에 저장된 외부 설정값이다.
         */

        String pathValue = System.getenv("PATH");
        System.out.println("PATH 환경 변수: " + pathValue);

        /*
         * ======================================
         * 11. System.lineSeparator()
         * ======================================
         *
         * 운영체제에 맞는 줄바꿈 문자를 반환한다.
         *
         * Windows : \r\n
         * Linux/Mac : \n
         */

        String line = "자바" + System.lineSeparator() + "유틸" + System.lineSeparator() + "클래스";
        System.out.println(line);

        /*
         * ======================================
         * 12. System.identityHashCode()
         * ======================================
         *
         * 객체의 실제 주소 기반 해시 느낌의 값을 반환한다.
         *
         * 오버라이딩한 hashCode()와 다르게
         * 객체 자체 기준으로 구분하고 싶을 때 볼 수 있다.
         */

        SystemUser user1 = new SystemUser("홍길동");
        SystemUser user2 = new SystemUser("홍길동");

        System.out.println("user1.hashCode() = " + user1.hashCode());
        System.out.println("user2.hashCode() = " + user2.hashCode());

        System.out.println("System.identityHashCode(user1) = " + System.identityHashCode(user1));
        System.out.println("System.identityHashCode(user2) = " + System.identityHashCode(user2));

        /*
         * ======================================
         * 13. hashCode()와 identityHashCode() 차이
         * ======================================
         *
         * hashCode()는 클래스에서 오버라이딩 가능하다.
         * identityHashCode()는 객체 자체 기준이다.
         *
         * 그래서 값이 같아도 다른 객체면
         * identityHashCode()는 다르게 나올 수 있다.
         */

        /*
         * ======================================
         * 14. 프로그램 종료 - System.exit()
         * ======================================
         *
         * 프로그램을 즉시 종료한다.
         *
         * 보통:
         * System.exit(0);   -> 정상 종료
         * System.exit(1);   -> 비정상 종료
         *
         * 주의:
         * 아래 코드를 실행하면 프로그램이 바로 끝나므로
         * 학습용으로는 주석 처리해두는 경우가 많다.
         */

        // System.out.println("프로그램 종료 전");
        // System.exit(0);
        // System.out.println("이 문장은 실행되지 않음");

        /*
         * ======================================
         * 15. 실무 느낌 예제 - 배열 복사 비교
         * ======================================
         *
         * 반복문으로 직접 복사할 수도 있지만
         * System.arraycopy()가 더 빠르고 간단한 경우가 많다.
         */

        int[] original = {1, 2, 3, 4, 5};
        int[] copied = new int[5];

        System.arraycopy(original, 0, copied, 0, original.length);

        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

        /*
         * ======================================
         * 16. System 클래스 요약
         * ======================================
         *
         * - out.println()         : 일반 출력
         * - err.println()         : 에러 출력
         * - currentTimeMillis()   : 밀리초 시간
         * - nanoTime()            : 나노초 시간
         * - arraycopy()           : 배열 복사
         * - getProperty()         : 시스템 속성 확인
         * - getenv()              : 환경 변수 확인
         * - lineSeparator()       : 줄바꿈 문자
         * - identityHashCode()    : 객체 기준 해시값
         * - exit()                : 프로그램 종료
         *
         * System 클래스는 자바 프로그램의 실행 환경과
         * 관련된 기능을 다룰 때 매우 자주 사용된다.
         */
    }
}

/*
 * ======================================
 * 17. hashCode()를 오버라이딩한 클래스
 * ======================================
 */
class SystemUser {

    String name;

    public SystemUser(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}