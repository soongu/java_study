package day03;

public class RandomEx {

    public static void main(String[] args) {

        double rn = Math.random();
        System.out.println("rn = " + rn);

        /*
         # 1 ~ 10 사이의 정수 난수값 발생

         Math.random()   ->   0.0 <= ~  < 1.0
         Math.random() * 10  ->  0.0 <= ~ < 10.0
         (int)(Math.random() * 10)  ->  0 <=  ~  < 10
         (int)(Math.random() * 10) + 1   ->   1  <=  ~  < 11

         # 공식
           (int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값;

           ex) 15 ~ 37
           (int) (Math.random() * (37 - 15 + 1)) + 15;
         */
        int ri = (int)(Math.random() * 10) + 1;
        System.out.println("ri = " + ri);
    }
}
