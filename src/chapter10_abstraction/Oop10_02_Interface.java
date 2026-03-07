package chapter10_abstraction;

/*
 * ===============================
 * 2) 인터페이스 (Interface)
 * ===============================
 *
 * 특징
 *
 * 1. interface 키워드 사용
 * 2. 객체 생성 불가능
 * 3. 메서드는 기본적으로 추상 메서드
 * 4. 필드는 public static final
 * 5. 구현은 implements 사용
 */

// 인터페이스
interface RemoteControl {

    // 인터페이스 필드 (자동으로 public static final)
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메서드 (자동으로 public abstract)
    void turnOn();

    void turnOff();

    void setVolume(int volume);
}

// 인터페이스 구현 클래스
class TV implements RemoteControl {

    int volume;

    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {

        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
}

public class Oop10_02_Interface {

    public static void main(String[] args) {

        TV tv = new TV();

        tv.turnOn();
        tv.setVolume(7);
        tv.turnOff();
    }
}