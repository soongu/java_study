package day02;

public class StdOutput {

    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";
        System.out.println(dog);
        System.out.println(cat);

        int month = 3;
        int day = 1;
        String annivasary = "삼일절";

        System.out.println(month + "월 " + day + "일은 "
                + annivasary + "입니다.");

        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, annivasary);
        System.out.println("안녕하세요!!!");

        System.out.println("=============================");

        // %f는 자동으로 소수점 6자리를 맞춥니다.
        double saleRate = 0.25;
        System.out.printf("할인율은 %.2f%%입니다.\n", saleRate);

    }
}
