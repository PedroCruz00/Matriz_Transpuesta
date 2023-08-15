package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InputSizePanel extends JPanel {
    private JLabel textSize;
    private JTextField inputSize;
    private JButton confirm;

    public InputSizePanel(ActionListener listener) {
        setLayout(new GridBagLayout());
        initComponents(listener);
    }
    public void initComponents(ActionListener listener){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;

        textSize = new JLabel("Ingrese el tamaño de la matriz: ");
        add(textSize,constraints);

        constraints.gridx = 1;
        inputSize = new JTextField(8);
        add(inputSize,constraints);

        constraints.gridx = 2;
        confirm = new JButton("Generar Matriz");
        confirm.addActionListener(listener);
        confirm.setActionCommand("generate");

        add(confirm,constraints);
    }

    public int getInputSize() {
        return Integer.parseInt(inputSize.getText());
    }

    public JButton getConfirm() {
        return confirm;
    }
}
