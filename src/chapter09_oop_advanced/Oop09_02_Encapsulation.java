package chapter09_oop_advanced;

/*
 * ===============================
 * 2) 캡슐화 (Encapsulation)
 * ===============================
 *
 * 필드를 private으로 숨기고
 * getter / setter 메서드를 통해
 * 데이터를 안전하게 접근하게 하는 것
 */

class Person {

    /*
     * 1. 필드를 private으로 숨김
     */

    private String name;
    private int age;

    /*
     * 2. Getter (값을 가져오는 메서드)
     */

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*
     * 3. Setter (값을 수정하는 메서드)
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        // 잘못된 값 방지
        if (age < 0) {
            System.out.println("나이는 0보다 작을 수 없습니다.");
            return;
        }

        this.age = age;
    }

    /*
     * 4. 정보 출력
     */

    public void introduce() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}

public class Oop09_02_Encapsulation {

    public static void main(String[] args) {

        Person p = new Person();

        /*
         * 직접 접근 불가능
         */

        // p.name = "홍길동";  // 컴파일 에러
        // p.age = 20;        // 컴파일 에러

        /*
         * Setter로 값 설정
         */

        p.setName("홍길동");
        p.setAge(20);

        p.introduce();

        System.out.println("------");

        /*
         * 잘못된 값 테스트
         */

        p.setAge(-5); // 방어 코드

        System.out.println("현재 나이: " + p.getAge());
    }
}