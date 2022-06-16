package alerts;

import javax.swing.*;
import java.awt.*;

public class AlertUI {
    public JFrame frame;
    public void popUp(String alert){
        if (frame == null) frame = new JFrame("BREAKPOINT ALERT!!");
        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        frame.setSize(300,200);
        JTextArea alertArea = new JTextArea(alert);
        alertArea.setLineWrap(true);
        alertArea.setWrapStyleWord(true);
        alertArea.setEditable(false);
        alertArea.setFont(new Font("Times", Font.BOLD, 20));
        alertArea.setLayout(new FlowLayout());

        frame.getContentPane().add(BorderLayout.CENTER, alertArea);

        frame.setVisible(true);
    }
}
