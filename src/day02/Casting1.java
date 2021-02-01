package day02;

public class Casting1 {

    public static void main(String[] args) {

        //묵시적 형변환, Upcasting, 자동 형변환, Promotion
        byte a = 100;
        int b = a;

        int c = 500;
        double d = c;
        System.out.println("d = " + d);

    }
}
