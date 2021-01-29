package day01;

public class VarScope {
    public static void main(String[] args) {

        //같은 타입의 변수를 선언할 때는 콤마로 나열 가능
        int num1 = 10, num2 = 20;

        if (true) {
            int num3 = num1 + num2;
//            int num3 = 100;
        }// end if
//        System.out.println(num3);

        int num3 = 100;

    }// end main
//    int num4 = num1 + num2;
}// end class
