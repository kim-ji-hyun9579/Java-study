package chapter15_file_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File03_BufferedWriter_Reader {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. BufferedWriter / BufferedReader 란?
         * ======================================
         *
         * BufferedWriter
         * : 문자 데이터를 버퍼에 모아뒀다가
         *   효율적으로 파일에 출력하는 클래스
         *
         * BufferedReader
         * : 문자 데이터를 버퍼 단위로 읽어와서
         *   더 편리하게 읽을 수 있게 해주는 클래스
         *
         * 장점
         * 1) 성능이 더 좋다
         * 2) 한 줄 단위 처리가 편하다
         *
         */


        /*
         * ======================================
         * 2. BufferedWriter로 파일 쓰기
         * ======================================
         *
         * BufferedWriter는 보통
         * FileWriter와 함께 사용한다.
         *
         */

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffered_test.txt"));

            bw.write("첫 번째 줄입니다.");
            bw.newLine();

            bw.write("두 번째 줄입니다.");
            bw.newLine();

            bw.write("세 번째 줄입니다.");
            bw.newLine();

            bw.close();

            System.out.println("버퍼 파일 쓰기 완료");

        } catch (IOException e) {
            System.out.println("버퍼 파일 쓰기 중 예외 발생");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 3. BufferedReader로 파일 읽기
         * ======================================
         *
         * BufferedReader는 보통
         * FileReader와 함께 사용한다.
         *
         * readLine()
         * : 한 줄씩 읽는다.
         *
         * 반환값
         * - 읽은 한 줄 문자열
         * - 더 이상 읽을 줄이 없으면 null
         *
         */

        try {
            BufferedReader br = new BufferedReader(new FileReader("buffered_test.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println("읽은 내용 : " + line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("버퍼 파일 읽기 중 예외 발생");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 4. append 모드로 추가 쓰기
         * ======================================
         */

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffered_test.txt", true));

            bw.write("네 번째 줄은 추가 모드입니다.");
            bw.newLine();

            bw.close();

            System.out.println("추가 쓰기 완료");

        } catch (IOException e) {
            System.out.println("추가 쓰기 중 예외 발생");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 5. 다시 전체 읽기
         * ======================================
         */

        try {
            BufferedReader br = new BufferedReader(new FileReader("buffered_test.txt"));

            String line;

            System.out.println("\n===== 추가 후 전체 내용 =====");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("다시 읽기 중 예외 발생");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 6. 정리
         * ======================================
         *
         * BufferedWriter
         * : 버퍼를 이용해 효율적으로 문자 출력
         *
         * BufferedReader
         * : 버퍼를 이용해 효율적으로 문자 입력
         *
         * newLine()
         * : 줄바꿈
         *
         * readLine()
         * : 한 줄씩 읽기
         *
         * 실무에서는
         * FileWriter / FileReader 보다
         * BufferedWriter / BufferedReader 를
         * 더 자주 사용하는 편이다.
         *
         */

    }

}