// ЛАБОРАТОРНАЯ РАБОТА №6 Горякина А.В.
package mypackage;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Шарики");
        frame.setSize(500,300);
        frame.setLocation(400,400);
        frame.setLayout(new GridLayout());
        JPanel panel = new JPanel();

        frame.add(panel);
        frame.setVisible(true);

        Balls ball1 = new Balls(panel, 1, 40, 200, 40);
        Balls ball2 = new Balls(panel, 12, 8, 100, 50);
        Balls ball3 = new Balls(panel, 6, 20, 30, 30);

        ball1.start();
        ball2.start();
        ball3.start();
    }
}
