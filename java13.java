import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class java13 extends JFrame{
    int [] data = {25,25,25,25};
    int [] arcAngle = new int [4];
    Color [] color = {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE};
    String [] itemName = {"apple", "cherry", "strawberry", "prune"};
    JTextField [] tf = new JTextField [4];
    ChartPanel chartPanel = new ChartPanel();

    java13() {
        setTitle("파이 차트 그리기");
        setDefaultCloseOperation(3);
        Container c = getContentPane();
        c.add(new InputPanel(), BorderLayout.NORTH);
        c.add(chartPanel, BorderLayout.CENTER);
        setSize(500,350);
        setVisible(true);
        drawChart();
    }

    void drawChart() {
        int sum=0;
        for(int i=0; i<data.length; i++) {
            data[i] = Integer.parseInt(tf[i].getText());
            sum+=data[i];
        }

        if(sum == 0) return;

        for(int i=0; i<data.length; i++)
            arcAngle[i]=(int)Math.round((double)data[i]/(double)sum*360);

        chartPanel.repaint();
    }

    class InputPanel extends JPanel {
        InputPanel() {
            setBackground(Color.LIGHT_GRAY);
            for(int i=0; i<tf.length; i++) {
                tf[i] = new JTextField("25", 5);
                tf[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        drawChart();
                    }
                });
                add(new JLabel(itemName[i]));
                add(tf[i]);
            }
        }
    }

    class ChartPanel extends JPanel {
        public void paintComponent(Graphics g) {
            int startAngle = 0;
            for(int i=0; i<data.length; i++) {
                g.setColor(color[i]);
                g.drawString(itemName[i]+" "+Math.round(arcAngle[i]*100./360.)+"%", 50+i*100, 20);
            }
            for(int i=0; i<data.length; i++) {
                g.setColor(color[i]);
                g.fillArc(150,50,200,200,startAngle, arcAngle[i]);
                startAngle = startAngle + arcAngle[i];
            }
        }
    }

    public static void main(String [] args) {
        new java13();
    }
}
