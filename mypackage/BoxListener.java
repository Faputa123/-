package mypackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class BoxListener implements ActionListener{
    
    private JComboBox<String> box;
    private JTextArea area;

    public BoxListener(JComboBox<String> box, JTextArea area){
        this.box = box;
        this.area = area;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int index = box.getSelectedIndex();
        area.setText(Coffe.Info[index]);
    }
    
}
