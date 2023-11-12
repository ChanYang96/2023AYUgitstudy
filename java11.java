import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Makeframe extends JFrame {
    Makeframe() {
        setTitle("클릭 연습용 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료 명령
        Container contai = getContentPane();
        contai.setLayout(null);
        JLabel label = new JLabel("c"); 
        label.setSize(10, 10);// 클릭 범위
        label.setLocation(100, 100);
        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int x = (int) (Math.random() * 300); //x, y 값 랜덤으로 지정
                int y = (int) (Math.random() * 300);// 이때 문자열이 프레임 밖으로 나가지 않기 위해 400 보다 작은 값 지정
                label.setLocation(x, y);
            }
        });
        contai.add(label);
        setSize(400, 400);
        setVisible(true);
    }
}
public class java11 {
    public static void main(String args[]){
        new Makeframe();
    }
}

