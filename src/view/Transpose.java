package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Transpose extends JPanel {
    public JButton generate;

    public Transpose(ActionListener listener) {
        setLayout(new GridBagLayout());
        initComponents(listener);
    }
    public void initComponents(ActionListener listener){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.CENTER;

        generate = new JButton("Transpuesta");
        generate.addActionListener(listener);
        generate.setActionCommand("transpose");
        add(generate,constraints);
    }
}
