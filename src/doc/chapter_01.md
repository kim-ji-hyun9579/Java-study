# Chapter 01. Java 시작하기

> 이 챕터는 **Java 공부 목적**으로 정리한 내용이다.  
> 개발 환경은 **IntelliJ IDEA + Java 17 (LTS)** 기준이다.

---

## 1. Java란 무엇인가
- **정의**: James Gosling에 의해 개발된 객체지향 프로그래밍 언어다.
- **주요 특징**:
    - **플랫폼 독립성 (Write Once, Run Anywhere)**: JVM 덕분에 운영체제에 상관없이 실행 가능하다.
    - **객체지향 언어 (OOP)**: 캡슐화, 상속, 다형성 등의 개념을 사용하여 유지보수가 용이하다.
    - **자동 메모리 관리 (GC)**: 가비지 컬렉터가 사용하지 않는 메모리를 자동으로 정리해준다.
- **활용 분야**: 안드로이드 앱 개발, 웹 백엔드(Spring), 빅데이터 시스템 등 광범위하게 사용된다.

---

## 2. JVM / JDK / JRE 개념
- **JVM (Java Virtual Machine)**: 자바 바이트코드를 실행하는 가상 머신이다. 플랫폼 독립성을 가능하게 하는 핵심 요소다.
- **JRE (Java Runtime Environment)**: 자바 프로그램을 **실행**하기 위한 환경이다. JVM과 표준 라이브러리를 포함한다.
- **JDK (Java Development Kit)**: 자바 프로그램을 **개발**하기 위한 도구다. JRE와 컴파일러(javac), 디버거 등을 포함한다.
- **관계 정리**: `JDK = JRE + 개발 도구`, `JRE = JVM + 표준 라이브러리`의 구조를 가진다. 공부를 위해서는 JDK를 설치해야 한다.

---

## 3. IntelliJ 설치 및 프로젝트 생성
- **IntelliJ IDEA 설치**: 자바 개발에서 가장 많이 쓰이는 최신 IDE다. (Community 또는 Ultimate 버전)
- **JDK 17(LTS) 설정**: 
    - [Project Structure] -> [Project] -> [SDK]에서 Java 17을 선택한다.
    - LTS(Long Term Support) 버전은 장기 지원 버전이므로 학습 및 프로젝트에 적합하다.
- **java-study 프로젝트 생성**: New Project를 통해 프로젝트를 생성하고 build system으로 IntelliJ 또는 Gradle을 선택한다.
- **패키지 구조**: `src` 폴더 하위에 패키지(예: `chapter01_basic`)를 생성하여 클래스를 관리하는 것이 관례다.

---

## 4. Hello World 실행
- **HelloJava 클래스 작성**: `public class HelloJava`는 클래스 이름과 파일 이름이 동일해야 함을 의미한다.
- **main 메서드 구조**: 자바 프로그램의 시작점(Entry Point)이다.
    - `public`: 어디서든 호출 가능
    - `static`: 객체 생성 없이 실행 가능
    - `void`: 반환 값이 없음
    - `String[] args`: 프로그램 실행 시 전달받는 인자
- **System.out.println**: 표준 출력 장치(콘솔)에 문자열을 출력한다.

### 실행 방법
1. IntelliJ에서 `main` 메서드 옆의 초록색 화살표 버튼을 클릭한다.
2. 실행 단축키: `Shift + F10` (Windows 기준)

```java
package chapter01_basic;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello, Java Study!");
    }
}