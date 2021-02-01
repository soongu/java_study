package day02;

public class PlusMinusOperator {

    public static void main(String[] args) {

        int x = 3;
        int y = ++x + 5 * 3;
        int z = 5 * y-- + x++ - --y;
        //x : ?, y : ?, z : ?
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
