package day03;

public class IfExample {

    public static void main(String[] args) {

        //1 ~ 100사이의 정수를 생성
        int point = (int) (Math.random() * 100) + 1;
        System.out.println("점수: " + point);
        
        if (point >= 60) {
            System.out.println("60점 이상입니다.");
            System.out.println("시험에 합격했습니다.");
        } else {
            System.out.println("60점 미만입니다.");
            System.out.println("시험에 불합격했습니다.");
        }
    }
}
