package dominio;

import java.util.List;

public class Tablero {
    
    private int dimension;
    private List<Cuadro> listaCuadros;

    public Tablero(int dimension, List<Cuadro> listaCuadros) {
        this.dimension = dimension;
        this.listaCuadros = listaCuadros;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<Cuadro> getListaCuadros() {
        return listaCuadros;
    }

    public void setListaCuadros(List<Cuadro> listaCuadros) {
        this.listaCuadros = listaCuadros;
    }

    @Override
    public String toString() {
        return "Tablero{" + "dimension=" + dimension + ", listaCuadros=" + listaCuadros + '}';
    }
    
}
