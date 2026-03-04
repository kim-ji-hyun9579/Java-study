package chapter09_oop_advanced;

/*
 * ===============================
 * 1) 접근 제어자 (Access Modifier)
 * ===============================
 *
 * public    : 어디서든 접근 가능
 * protected : 같은 패키지 + 상속 관계면 다른 패키지도 가능
 * default   : (아무것도 안 쓰면) 같은 패키지에서만 접근 가능
 * private   : 같은 클래스 내부에서만 접근 가능
 */

class AccessBox {

    // 1) 필드 접근 제어자
    public String publicData = "publicData";
    protected String protectedData = "protectedData";
    String defaultData = "defaultData";      // default (package-private)
    private String privateData = "privateData";

    // 2) 메서드 접근 제어자
    public void publicMethod() {
        System.out.println("publicMethod() 호출됨");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod() 호출됨");
    }

    void defaultMethod() {
        System.out.println("defaultMethod() 호출됨");
    }

    private void privateMethod() {
        System.out.println("privateMethod() 호출됨");
    }

    // 3) private는 클래스 내부에서는 사용 가능
    public void showPrivate() {
        System.out.println("privateData = " + privateData);
        privateMethod();
    }
}

public class Oop09_01_AccessModifier {

    public static void main(String[] args) {

        AccessBox box = new AccessBox();

        // 같은 패키지(chapter09_oop_advanced) 안에서는
        // public / protected / default 까지는 접근 가능
        System.out.println(box.publicData);
        System.out.println(box.protectedData);
        System.out.println(box.defaultData);

        box.publicMethod();
        box.protectedMethod();
        box.defaultMethod();

        System.out.println("------");

        // private는 "클래스 밖"에서는 접근 불가 (컴파일 에러)
        // System.out.println(box.privateData);
        // box.privateMethod();

        // 대신 public 메서드로 내부 private 접근을 "간접적으로" 가능
        box.showPrivate();
    }
}