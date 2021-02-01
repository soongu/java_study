package day02;

public class BitOperator {

    public static void main(String[] args) {

        //비트 반전 연산자
        byte x = 8;
        System.out.println("~x = " + ~x);

        //비트 연산 (2항)
        byte a = 5;      // 00000101
        byte b = 3;      // 00000011
        // & -> 논리곱: 각 자리수를 곱하라
        System.out.println(a & b);  // 00000001  -> 1
        // | -> 논리합: 각 자리수를 더해라, 단 1 + 1은 1이다.
        System.out.println(a | b);  // 00000111  -> 7
        // ^ -> 배타적 논리합: 다르면 1 같으면 0
        System.out.println(a ^ b);  // 00000110  -> 6

    }
}
