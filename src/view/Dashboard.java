package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class Dashboard extends JFrame {
    private Toolkit toolkit;
    private Dimension dimension;
    private  InputSizePanel inputSizePanel;
    private MatrizPanel matrizJPanel;
    private Transpose transpose;
    private ArrayList<ArrayList<Object>> matriz;

    public Dashboard(ArrayList<ArrayList<Object>> matriz,ActionListener listener) {
        setBackground(new Color(150,165,210));
        toolkit = Toolkit.getDefaultToolkit();
        dimension = toolkit.getScreenSize();
        setSize(dimension);
        setLayout(new GridBagLayout());
        this.matriz = matriz;
        initPanel(matriz, listener);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void initPanel(ArrayList<ArrayList<Object>> matriz, ActionListener listener){
        GridBagConstraints constraints = new GridBagConstraints();

        inputSizePanel = new InputSizePanel(listener);
        this.getContentPane().add(inputSizePanel,constraints);

        constraints.gridy = 1;
        constraints.gridheight = 2;
        matrizJPanel = new MatrizPanel(matriz);
        this.getContentPane().add(matrizJPanel,constraints);
        constraints.gridy = 3;
        constraints.gridheight = 1;
        transpose = new Transpose(listener);
        this.getContentPane().add(transpose,constraints);
    }
    public int getSizeMatriz(){
        return inputSizePanel.getInputSize();
    }
    public JButton getConfirm(){
        return inputSizePanel.getConfirm();
    }

    public void setMatriz(ArrayList<ArrayList<Object>> matriz) {
        matrizJPanel.setMatriz(matriz);
        matrizJPanel.reFillGrid();
    }

}
