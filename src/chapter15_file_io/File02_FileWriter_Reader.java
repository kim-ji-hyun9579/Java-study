package chapter15_file_io;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class File02_FileWriter_Reader {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. Writer / Reader 란?
         * ======================================
         *
         * Writer
         * : 문자 데이터를 파일에 저장할 때 사용
         *
         * Reader
         * : 문자 데이터를 파일에서 읽어올 때 사용
         *
         * 즉,
         * 텍스트 파일(.txt, .csv, .html 등)처럼
         * "문자" 중심 데이터를 다룰 때 사용한다.
         *
         */


        /*
         * ======================================
         * 2. FileWriter
         * ======================================
         *
         * FileWriter
         * : 파일에 문자 데이터를 쓰는 클래스
         *
         * 주의:
         * 기본 생성 방식은 기존 내용을 덮어쓴다.
         *
         */

        try {
            FileWriter fw = new FileWriter("writer_test.txt");

            fw.write("안녕하세요\n");
            fw.write("자바 파일 입출력 공부 중입니다.\n");
            fw.write("FileWriter는 문자 데이터를 저장합니다.\n");

            fw.close();

            System.out.println("파일 쓰기 완료");

        } catch (IOException e) {
            System.out.println("파일 쓰기 중 예외 발생");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 3. FileReader
         * ======================================
         *
         * FileReader
         * : 파일에서 문자 데이터를 읽는 클래스
         *
         * read()
         * : 한 글자씩 읽는다.
         *
         * 반환값
         * - 읽은 문자
         * - 더 이상 읽을 데이터가 없으면 -1
         *
         */

        try {
            FileReader fr = new FileReader("writer_test.txt");

            int data;

            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("파일 읽기 중 예외 발생");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 4. append 모드
         * ======================================
         *
         * FileWriter("파일명", true)
         * : 기존 내용 뒤에 이어서 작성
         *
         * true  -> 추가 모드
         * false -> 덮어쓰기 모드(기본)
         *
         */

        try {
            FileWriter fw = new FileWriter("writer_test.txt", true);

            fw.write("이 문장은 기존 내용 뒤에 추가됩니다.\n");

            fw.close();

            System.out.println("\n추가 쓰기 완료");

        } catch (IOException e) {
            System.out.println("추가 쓰기 중 예외 발생");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 5. 다시 읽기
         * ======================================
         */

        try {
            FileReader fr = new FileReader("writer_test.txt");

            int data;

            System.out.println("\n===== 추가 후 파일 내용 =====");

            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("다시 읽기 중 예외 발생");
            e.printStackTrace();
        }



        /*
         * ======================================
         * 6. 정리
         * ======================================
         *
         * FileWriter
         * : 문자 데이터를 파일에 저장
         *
         * FileReader
         * : 문자 데이터를 파일에서 읽기
         *
         * write()
         * : 파일에 문자 작성
         *
         * read()
         * : 파일에서 한 글자씩 읽기
         *
         * close()
         * : 사용 후 반드시 닫기
         *
         */

    }

}