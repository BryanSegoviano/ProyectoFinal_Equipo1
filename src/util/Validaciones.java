package util;
/**
 * Clase que se encarga de validar las coordenadas en la tabla. 
 * 
 * @author Administrador
 */
public class Validaciones {
    /**
     * Metodo encargado de validar las coordenas aplastadas dentro de la tabla.
     * 
     * @param x coordenada x
     * @param y coordenada y
     * @return areglo.
     */
    public int[] validaCoordenadas(int x, int y) {
//        System.out.println("entra");
        int arreglo[] = new int[2];
        arreglo[0] = x;
        arreglo[1] = y;
        int aux;
        //Coordenadas bien aplastadas
        if ((x % 20) - 2 == 0 && (y % 16) - 2 == 0) {
            System.out.println(" ok");
        } else {
            //Error en coordenada x
            if ((x % 20) - 2 != 0) {
                //Cerca de un punto a la derecha
                if (x % 20 > 10) {
                    aux = 20 - (x % 20);
                    arreglo[0] = x + aux + 2;
                } else {
                    aux = (x % 20) - 2;
                    arreglo[0] = x - aux;
                }

            }
            //Error en coordenada y
            if ((y % 16) - 2 != 0) {
                if (y % 16 > 8) {
                    aux = 16 - (y % 16);
                    arreglo[1] = y + aux + 2;
                } else {
                    aux = (y % 16) - 2;
                    arreglo[1] = y - aux;
                }
            }
        }
        return arreglo;
    }
    /**
     * Metodo encargado de verificar coordenadas fuera de lugar.
     * 
     * @param x1 coordenada x1
     * @param y1 coordenada y1
     * @param x2 coordenada x2
     * @param y2 coordenada y2
     * @return arreglo.
     */
    public int[] validaSegundoClick(int x1, int y1, int x2, int y2) {
        int arreglo[];
        int arreglo2[];
        arreglo = validaCoordenadas(x1, y1);
        arreglo2 = validaCoordenadas(x2, y2);
        x1 = arreglo[0];
        y1 = arreglo[1];
        //verifica X
        //x2 esta fuera de rango
        if (x2 + 20 != x1 || x2 - 20 != x1) {
            //x2 muy a la derecha, mover a la izquierda
            int diferencia = x1 - x2;
            if (diferencia > 0) {
                x2=x1+20;
            }else{
                x2=x1-20;
            }
        }
        //verifica Y
        if (y2 + 16 != y1 || y2 - 16 != y1) {
            //y2 muy a la derecha, mover a la izquierda
            int diferencia = y1 - y2;
            if (diferencia > 0) {
                y2=y1+16;
            }else{
                y2=y1-16;
            }
        }
        
        arreglo[0]=x2;
        arreglo[1]=y2;
        return arreglo;
    }
}
