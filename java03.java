import java.util.Scanner;
public class java03 {
    public static void main(String[] args) {

        String RockPaperScissors[] = {"가위", "바위", "보"};
        int randomRPS = 0;
        String UserRPS ="";
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("가위 바위 보!");
            randomRPS = (int)(Math.random()*3);
            UserRPS = scan.next();
            if(UserRPS.equals("그만")){
                System.out.println("게임을 종료합니다.."); break;
            }
            System.out.println(UserRPS);
            switch (UserRPS){
                case "가위":
                    if (RockPaperScissors[randomRPS].equals("가위")){
                        System.out.println("사용자 : " + UserRPS + "   컴퓨터 : " + RockPaperScissors[randomRPS] + "     비겼습니다."); break;
                    }
                    if (RockPaperScissors[randomRPS].equals("바위")){
                        System.out.println("사용자 : " + UserRPS + "   컴퓨터 : " + RockPaperScissors[randomRPS] + "     컴퓨터가 이겼습니다."); break;
                    }
                    if (RockPaperScissors[randomRPS].equals("보")){
                        System.out.println("사용자 : " + UserRPS + "   컴퓨터 : " + RockPaperScissors[randomRPS] + "     사용자가 이겼습니다."); break;
                    }

                case "바위":
                    if (RockPaperScissors[randomRPS].equals("가위")){
                        System.out.println("사용자 : " + UserRPS + "   컴퓨터 : " + RockPaperScissors[randomRPS] + "     사용자가 이겼습니다."); break;
                    }
                    if (RockPaperScissors[randomRPS].equals("바위")){
                        System.out.println("사용자 : " + UserRPS + "   컴퓨터 : " + RockPaperScissors[randomRPS] + "     비겼습니다."); break;
                    }
                    if (RockPaperScissors[randomRPS].equals("보")){
                        System.out.println("사용자 : " + UserRPS + "   컴퓨터 : " + RockPaperScissors[randomRPS] + "     컴퓨터가 이겼습니다."); break;
                    }

                case "보":
                    if (RockPaperScissors[randomRPS].equals("가위")){
                        System.out.println("사용자 : " + UserRPS + "   컴퓨터 : " + RockPaperScissors[randomRPS] + "     컴퓨터가 이겼습니다."); break;
                    }
                    if (RockPaperScissors[randomRPS].equals("바위")){
                        System.out.println("사용자 : " + UserRPS + "   컴퓨터 : " + RockPaperScissors[randomRPS] + "     사용자가 이겼습니다."); break;
                    }
                    if (RockPaperScissors[randomRPS].equals("보")){
                        System.out.println("사용자 : " + UserRPS + "   컴퓨터 : " + RockPaperScissors[randomRPS] + "     비겼습니다."); break;
                    }
            }
        }
    }
}