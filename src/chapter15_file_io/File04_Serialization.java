package chapter15_file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File04_Serialization {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. 직렬화(Serialization)란?
         * ======================================
         *
         * 직렬화
         * : 객체를 파일에 저장하거나
         *   네트워크로 전송할 수 있는 형태로 바꾸는 것
         *
         * 역직렬화
         * : 저장된 데이터를 다시 객체로 복원하는 것
         *
         * 즉,
         * 자바 객체 자체를 통째로 저장했다가
         * 다시 꺼내오는 기술이다.
         *
         */


        /*
         * ======================================
         * 2. Serializable 인터페이스
         * ======================================
         *
         * 객체를 직렬화하려면
         * 해당 클래스가 Serializable 인터페이스를 구현해야 한다.
         *
         * implements Serializable
         *
         * Serializable은
         * 메서드가 없는 "표식 인터페이스(marker interface)"이다.
         *
         * "이 클래스는 직렬화 가능하다"
         * 라고 표시해주는 역할을 한다.
         *
         */


        /*
         * ======================================
         * 3. 객체 생성
         * ======================================
         */

        Person person = new Person("김지현", 20);


        /*
         * ======================================
         * 4. 객체 직렬화
         * ======================================
         *
         * ObjectOutputStream
         * : 객체를 파일에 저장
         *
         */

        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("person.dat"));

            oos.writeObject(person);
            oos.close();

            System.out.println("객체 직렬화 완료");

        } catch (IOException e) {
            System.out.println("객체 저장 중 예외 발생");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 5. 객체 역직렬화
         * ======================================
         *
         * ObjectInputStream
         * : 파일에 저장된 객체를 다시 읽어옴
         *
         */

        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("person.dat"));

            Person result = (Person) ois.readObject();
            ois.close();

            System.out.println("객체 역직렬화 완료");
            result.showInfo();

        } catch (IOException e) {
            System.out.println("객체 읽기 중 예외 발생");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스를 찾을 수 없음");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 6. 정리
         * ======================================
         *
         * Serializable
         * : 직렬화 가능 표시
         *
         * ObjectOutputStream
         * : 객체 저장
         *
         * ObjectInputStream
         * : 객체 읽기
         *
         * writeObject()
         * : 객체를 파일로 저장
         *
         * readObject()
         * : 파일에서 객체를 읽어옴
         *
         */

    }

}