package model;

import java.util.ArrayList;

public class GenerateMatriz {
    private ArrayList<ArrayList<Object>> matriz ;
    private int size;

    public GenerateMatriz(int size) {
        matriz = new ArrayList<>();
        this.size = size;
        initMatriz();
    }
    public void initMatriz() {
        int numberInit = 1;
        for (int i = 0; i < size; i++) {
            ArrayList<Object> fila = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                fila.add(numberInit);
                numberInit++;
            }
            matriz.add(fila);
        }
    }

    public ArrayList<ArrayList<Object>> getMatriz() {
        return matriz;
    }
    public ArrayList<ArrayList<Object>> transpose() {
        int rows = this.matriz.size();
        int cols = this.matriz.get(0).size();

        ArrayList<ArrayList<Object>> transposeMatrix = new ArrayList<>();
        for (int i = 0; i < cols; i++) {
            transposeMatrix.add(new ArrayList<Object>());
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix.get(i).add(this.matriz.get(j).get(i));
            }
        }
        return transposeMatrix;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
