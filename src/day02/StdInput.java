package day02;

//1. 스캐너 API 불러오기
import java.util.Scanner;

public class StdInput {

    public static void main(String[] args) {

        //2. 스캐너의 객체 생성
        Scanner sc = new Scanner(System.in);

        /*
         3. Scanner의 함수들을 사용하여 데이터를 입력받음.
         - next(): 공백을 포함하지 않는 문자열을 입력.
         - nextLine(): 공백을 포함한 문자열을 입력.
         - next + 기본타입명(): 해당 타입에 맞는 데이터를 입력받을 때.
           ex ) nextInt(), nextDouble()
         */
        System.out.println("# 정보를 입력하세요.");
        System.out.print("- 이름을 입력: ");
        String name = sc.next();

        System.out.print("- 나이를 입력: ");
        int age = sc.nextInt();

        System.out.println("========================");
        System.out.printf("입력한 이름은 %s고, 나이는 %d세입니다.\n"
                , name, age);

        //4. 스캐너 메모리 해제
        sc.close();
    }
}
