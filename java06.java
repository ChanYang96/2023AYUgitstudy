import java.util.Scanner;

class Person {
    private int num1, num2, num3; //난수를 입력받을 변수
    public String name;
    public Person(String name) {
        this.name = name; //생성자
    }
    public boolean game() {
        num1 = (int) ((Math.random()*3)+1);
        num2 = (int) ((Math.random()*3)+1);
        num3 = (int) ((Math.random()*3)+1);
        System.out.print(" "+num1+"  "+num2+"  "+num3+"  ");
        if(num1 == num2 && num2 == num3)
            return true;
        else
            return false;
    }
}
public class java06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int num = sc.nextInt(); //참여자 수
        Person[] person = new Person[num]; //참여자 수 만큼 객체 배열 선언
        for(int i=0; i<num; i++) {
            System.out.print((i+1)+"번째 선수 이름>>");
            String name = sc.next();
            person[i] = new Person(name);
        }
        System.out.println(" ");
        while(true) {
            for(int i=0; i<num; i++) { //참여자 수 만큼 반복한다
                System.out.print(person[i].name);
                String enter = sc.nextLine();
                if(person[i].game()) {
                    System.out.println(person[i].name+" 님이 이겼습니다!");
                    return;
                }
                System.out.println(" 아쉽군요!");
            }
        }
    }
}
