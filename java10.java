import javax.swing.*;
import java.awt.*;

class Makeframe extends JFrame {
    public Makeframe() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con =getContentPane();
        con.setLayout(new BorderLayout());

        JPanel top=new JPanel();
        top.setLayout(new FlowLayout());
        top.setBackground(Color.LIGHT_GRAY);
        top.add(new JLabel("수식입력"));
        top.add(new JTextField(" ",20));

        con.add(top,BorderLayout.NORTH);

        JPanel center=new JPanel();
        center.setLayout(new GridLayout(4,4,5,5));
        JButton btn[]=new JButton[16];
        String name[]= {"0","1","2","3","4","5","6","7","8","9","CE","계산","+","-","x","/"};
        for(int i=0;i<16;i++) {
            btn[i]=new JButton(name[i]);
            if(i>=12) {
                btn[i].setBackground(Color.green);
            }
            center.add(btn[i]);
        }
        con.add(center,BorderLayout.CENTER);

        JPanel bottom=new JPanel();
        bottom.setLayout(new FlowLayout());
        bottom.setBackground(Color.yellow);
        bottom.add(new JLabel("계산 결과"));
        bottom.add(new JTextField(" ",20));
        con.add(bottom,BorderLayout.SOUTH);

        setSize(600,600);
        setVisible(true);
    }
}
public class java10 {
    public static void main(String[] args) {
        new Makeframe();
    }

}
