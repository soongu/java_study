package day01;

public class Variable {

    public static void main(String[] args) {

        //변수의 선언
        int score;

        //변수의 초기화
        score = 100;

        System.out.println(score);

        // 변수는 선언과 동시에 초기화가 가능
        int life = 50;

        //변수의 값 변경
        life = 80;
        System.out.println(life);

        int triple = score * 3;
        System.out.println("triple = " + triple);

        //변수의 타입에 맞지 않는 데이터는 저장 불가능
//        int price = 230.5; // (X)

        //텍스트를 저장할 때는 String 타입을 사용
        String nickName = "홍길동";
//        nickName = 500;

        //같은 이름으로 중복 선언 불가능
//        String score = "100쩜!";

        //선언이나 초기화되지 않은 변수는 사용 불가능
        int result = 500;
        System.out.println(result);
    }
}
