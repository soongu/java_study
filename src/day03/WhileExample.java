package day03;

public class WhileExample {

    public static void main(String[] args) {

        // 48 ~ 150 사이의 8의 배수를 출력하기
        /*
        int i = 48;
        while (i <= 150) {
            System.out.print(i + " ");
            i += 8;
        }
         */
        for (int i = 48; i <= 150; i += 8) {
            System.out.print(i + " ");
        }
        System.out.println(); //단순 줄개행

        // 1 ~ 100 사이의 정수중 4의 배수를 출력해라
        /*
        int j = 1;
        while (j <= 100) {
            if (j % 4 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
         */
        for (int j = 1; j <= 100; j++) {
            if (j % 4 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}
