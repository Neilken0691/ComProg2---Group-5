import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MotorPHEmployeeAppGUI extends JFrame {
    
    private int width;
    private int height;
    private JButton button;
    private MyActionListener mal;
    private JLabel label;
    private JTextField textField;
    
    
    public MotorPHEmployeeAppGUI(int w, int h) {
            width = w;
            height = h;
            button = new JButton("SUBMIT");
            mal = new MyActionListener();
            label = new JLabel("Employee ID");
            textField = new JTextField();
    }
    
    public void setUpGUI() {
        setSize(width, height);
        setTitle("MotorPH Employee App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(button);
        button.addActionListener(mal);
        add(label);
        textField.setSize(new Dimension(250,40));
        setVisible(true);
    }
    
    private class MyActionListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Generate Payslip.");
        }
    }
}