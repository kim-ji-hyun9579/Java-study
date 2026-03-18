package chapter15_file_io;

import java.io.File;
import java.io.IOException;

public class File01_Basic {

    public static void main(String[] args) {

        /*
         * ======================================
         * 1. 파일 입출력(File I/O)이란?
         * ======================================
         *
         * I/O는
         * Input / Output 의 줄임말이다.
         *
         * Input  = 입력
         * Output = 출력
         *
         * 즉,
         * 자바 프로그램이 파일에 데이터를 저장하거나,
         * 파일에 있는 데이터를 읽어오는 작업을
         * 파일 입출력이라고 한다.
         *
         */


        /*
         * ======================================
         * 2. File 객체란?
         * ======================================
         *
         * java.io.File 클래스는
         * "실제 파일 내용"을 읽고 쓰는 클래스가 아니라,
         *
         * 파일 또는 폴더의
         * 경로, 존재 여부, 이름, 크기 등의
         * 정보를 다루는 클래스이다.
         *
         */


        /*
         * ======================================
         * 3. File 객체 생성
         * ======================================
         */

        File file = new File("test.txt");

        System.out.println("파일명 : " + file.getName());
        System.out.println("경로 : " + file.getPath());
        System.out.println("절대경로 : " + file.getAbsolutePath());


        /*
         * ======================================
         * 4. 파일 존재 여부 확인
         * ======================================
         */

        System.out.println("파일 존재 여부 : " + file.exists());


        /*
         * ======================================
         * 5. 파일 생성
         * ======================================
         *
         * createNewFile()
         * : 실제로 빈 파일을 생성한다.
         *
         * 이미 파일이 있으면 false
         * 파일이 없어서 새로 만들면 true
         *
         */

        try {
            if (file.createNewFile()) {
                System.out.println("파일 생성 완료");
            } else {
                System.out.println("이미 파일이 존재함");
            }
        } catch (IOException e) {
            System.out.println("파일 생성 중 예외 발생");
            e.printStackTrace();
        }


        /*
         * ======================================
         * 6. 파일 정보 확인
         * ======================================
         */

        System.out.println("다시 파일 존재 여부 : " + file.exists());
        System.out.println("파일인가? : " + file.isFile());
        System.out.println("폴더인가? : " + file.isDirectory());
        System.out.println("파일 크기(byte) : " + file.length());


        /*
         * ======================================
         * 7. 폴더 객체 생성
         * ======================================
         */

        File dir = new File("myFolder");

        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("폴더 생성 완료");
            } else {
                System.out.println("폴더 생성 실패");
            }
        } else {
            System.out.println("이미 폴더가 존재함");
        }


        /*
         * ======================================
         * 8. File 클래스 핵심 정리
         * ======================================
         *
         * File 클래스는
         * 파일 내용을 직접 읽고 쓰기보다는
         *
         * 파일/폴더의 존재 여부
         * 경로 정보
         * 생성/삭제
         * 파일 크기
         *
         * 같은 정보를 다루는 데 사용한다.
         *
         * 실제 내용을 읽고 쓰는 것은
         * Reader, Writer, InputStream, OutputStream 등이 담당한다.
         *
         */

    }

}