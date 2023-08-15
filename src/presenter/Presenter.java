package presenter;

import model.GenerateMatriz;
import view.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {
    private  Dashboard dashboard;
    private GenerateMatriz matriz;
    public Presenter() {
        matriz = new GenerateMatriz(3);
        dashboard = new Dashboard(matriz.getMatriz(),this);
    }
    public void update(){
        dashboard.getSizeMatriz();
    }

    public static void main(String[] args) {
        new Presenter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comand = e.getActionCommand();
        if (comand.equals("generate")){
            dashboard.setMatriz(new GenerateMatriz(dashboard.getSizeMatriz()).getMatriz());
        }
        if (comand.equals("transpose")) {
            dashboard.setMatriz(new GenerateMatriz(dashboard.getSizeMatriz()).transpose());

        }
    }
}
