package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class MatrizPanel extends JPanel {
    ArrayList<ArrayList<Object>> matriz;
    private int size;
    private Toolkit toolkit;
    private Dimension dimension;
    public MatrizPanel(ArrayList<ArrayList<Object>> matriz) {
        this.matriz =matriz;
        this.size = this.matriz.get(0).size();
        toolkit = Toolkit.getDefaultToolkit();
        dimension = toolkit.getScreenSize();
        this.setPreferredSize(new Dimension(dimension.width/2,dimension.height/2));
        setLayout(new GridLayout(size,size));
        fillGrid();
    }
    public void fillGrid(){
        for (int i = 0; i < matriz.get(0).size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                JLabel label = new JLabel(String.valueOf(matriz.get(i).get(j)));
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                add(label);
            }
        }
    }
    public void reFillGrid(){
        this.size = matriz.get(0).size();
        this.setLayout(new GridLayout(size,size));
        this.removeAll();
        for (int i = 0; i < matriz.get(0).size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                JLabel label = new JLabel(String.valueOf((matriz.get(i).get(j))));
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                add(label);
                label.revalidate();
                label.repaint();
            }
        }

    }
    public void setMatriz(ArrayList<ArrayList<Object>> matriz) {
        this.matriz = matriz;
    }

    public ArrayList<ArrayList<Object>> getMatriz() {
        return matriz;
    }
}
