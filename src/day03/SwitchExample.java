package day03;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 적으세요! ]");
        System.out.print(">> ");

        String season = scanner.next();
        scanner.close();

        // 문자열, 정수형 변수나 상수를 넣는다.
        switch (season) {

            //case에는 변수를 넣으면 안됨! 상수나 리터럴만 가능!
            case "spring": case "봄": case "春":
                System.out.println("봄에는 팔당으로 가보세요.");
                break;
            case "여름": case "summer":
                System.out.println("여름에는 대천으로 가보세요.");
                break;
            case "가을": case "fall":
                System.out.println("가을에는 지리산에 가보세요.");
                break;
            case "겨울": case "winter":
                System.out.println("겨울에는 스키장에 가보세요.");
                break;
            default:
                System.out.println("[봄, 여름, 가을, 겨울 중 입력하세요.]");
        }
    }
}
