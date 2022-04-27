package Ejercicio2;

/**
 *
 * @author jhone
 */
public class Cuenta {

    private int saldo;
    private final int saldoInicial;

    public Cuenta(int saldo){
        this.saldoInicial=saldo;
        this.saldo=saldo;
    }
    public synchronized void hacerMovimiento(int cantidad){
        this.saldo = this.saldo+cantidad;
    }
    public boolean esSimulacionCorrecta(){
        return this.saldo==this.saldoInicial;
    }
    public int getSaldo(){
        return this.saldo;
    }
}
