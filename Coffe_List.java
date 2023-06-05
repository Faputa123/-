// ЛАБОРАТОРНАЯ РАБОТА №2 Горякина А.В.
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.*;


public class Coffe_List{

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(6,0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocation(500,500);
        frame.setTitle("Прайс-лист кофе");
        frame.setVisible(true);

        final JComboBox selectcoffe = new JComboBox<String>(new String[] {"Эспрессо", "Латте"});
        final JTextField countcup = new JTextField("Количество чашек");
        final JRadioButton countsugar = new JRadioButton("Добавить сахар?");
        final JCheckBox cream = new JCheckBox("Добавить сливки?");
        final JButton confirmbut = new JButton("Оформить заказ");
        final JTextField resultf = new JTextField("Стоимость заказа");

        frame.add(selectcoffe);
        frame.add(countcup);
        frame.add(countsugar);
        frame.add(cream);
        frame.add(confirmbut);

        confirmbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float result = 0;
                float cup = Float.parseFloat(countcup.getText());
                if (selectcoffe.getSelectedItem().equals("Эспрессо")) result+=100*cup;
                else if(selectcoffe.getSelectedItem().equals("Латте")) result+=250*cup;
                if (countsugar.isSelected()) result+=8*cup;
                if (cream.isSelected()) result+=5*cup;
                
                frame.add(resultf);
                resultf.setText(String.valueOf(result));
            }
        });
    }

}