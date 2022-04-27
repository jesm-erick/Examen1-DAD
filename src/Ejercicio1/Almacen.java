package Ejercicio1;

/**
 *
 * @author jhone
 */
public class Almacen {
        private int numProductos;
        public Almacen(int nProductos){
                this.numProductos=nProductos;
        }
        public boolean cogerProducto(){
                if (this.numProductos>0){
                        this.numProductos--;
                        return true;
                }
                return false;
        }
}
